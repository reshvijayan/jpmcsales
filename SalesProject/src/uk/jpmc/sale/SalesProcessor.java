/**
 * 
 */
package uk.jpmc.sale;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesProcessor {

	private HashMap<Integer, SalesPackage> map;
	/**
	 * @return the map
	 */
	public HashMap<Integer, SalesPackage> getMap() {
		return map;
	}
	/**
	 * @param map the map to set
	 */
	public void setMap(HashMap<Integer, SalesPackage> map) {
		this.map = map;
	}
	private int count = 1;
	
	public SalesProcessor(){
		map = new HashMap<>();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SalesProcessor processor = new SalesProcessor();
		try(Scanner scanner = new Scanner(System.in)){
			SalesPackage p;
			while(true){
				try{
					p = new SalesPackage();
					System.out.println("Please enter Item Code:");
					p.setItemReference(scanner.nextLine());
					System.out.println("Please enter Unit Price:");
					double unitPrice = Double.parseDouble(scanner.nextLine());
					if(unitPrice <= 0)
						throw new Exception();
					p.setUnitPrice(unitPrice);
					System.out.println("Please enter quantity:");
					int quantity = Integer.parseInt(scanner.nextLine());
					if(quantity <= 0)
						throw new Exception();
					p.setNumberOfSales(quantity);
					System.out.println("Please enter adjustment value:");
					p.setAdjustmentFactor(Double.parseDouble(scanner.nextLine()));
					if(processor.processSale(p))break;
				}catch (Exception e) {
					if(e instanceof NumberFormatException)
						System.err.println("Incorrect format number. Skipping this entry");
					else
						System.err.println("Number is not in valid range. Skipping this entry");
					continue;
				}
			}
		}
	}
	
	public boolean processSale(SalesPackage p){
		if(map.size()<= 50){
			map.put(count, p);
			
			if(map.size()%10 == 0){
				printSalesReport();
			}
			if(map.size()==50){
				printAdjustmentReport();
				System.out.println("Completed. Pausing Operations...");
				return true;
			}
			count++;
		}
		return false;
	}
	private void printAdjustmentReport() {
		System.out.println("-----------------------------------------------");
		System.out.println("|\tProductID\t|\tAdjustment\t|");
		System.out.println("-----------------------------------------------");
		Map<String, Double> sorter = getAdjustmentReport();
		for(String key:sorter.keySet()){
			System.out.println("|\t"+key+"\t\t|\t"+sorter.get(key)+"\t|");
		}
	}
	private Map<String, Double> getAdjustmentReport() {
		Map<String, Double> sorter = new HashMap<>();
		for(SalesPackage p:map.values()){
			if(sorter.containsKey(p.getItemReference())){
				sorter.put(p.getItemReference(), sorter.get(p.getItemReference())+(p.getAdjustmentFactor()*p.getNumberOfSales()));
			}else{
				sorter.put(p.getItemReference(), p.getAdjustmentFactor()*p.getNumberOfSales());
			}
		}
		return sorter;
	}
	private void printSalesReport() {
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("|\tProductID\t|\tUnit Price\t|\tQuantity\t|\tAdjustment\t|\tAmount\t|");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		Map<String, SalesPackage> sorter = getSalesReport();
		double sum = 0.0;
		for(String key:sorter.keySet()){
			SalesPackage p = sorter.get(key);
			System.out.println("|\t"+p.getItemReference()+"\t\t|\t"+p.getUnitPrice()+"\t\t|\t"+p.getNumberOfSales()+"\t\t|\t"+
					p.getAdjustmentFactor()+"\t\t|\t"+
			(p.getUnitPrice()+p.getAdjustmentFactor())*p.getNumberOfSales()+"\t|");
			sum+=(p.getUnitPrice()+p.getAdjustmentFactor())*p.getNumberOfSales();
		}
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\tTotal  -> "+sum);
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		
	}
	private Map<String, SalesPackage> getSalesReport() {
		HashMap<String, SalesPackage> sorter = new HashMap<>();
		for(SalesPackage p:map.values()){
			if(sorter.containsKey(p.getItemReference())){
				sorter.put(p.getItemReference(), new SalesPackage(p.getItemReference(), p.getUnitPrice(), 
						sorter.get(p.getItemReference()).getNumberOfSales()+p.getNumberOfSales(), 
						sorter.get(p.getItemReference()).getAdjustmentFactor()+p.getAdjustmentFactor()));
			}else{
				sorter.put(p.getItemReference(), new SalesPackage(p.getItemReference(), p.getUnitPrice(),p.getNumberOfSales(), p.getAdjustmentFactor()));
			}
		}
		return sorter;
	}

}
