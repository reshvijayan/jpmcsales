/**
 * 
 */
package uk.jpmc.sale;

/**
 * @author Reshma
 *
 */
public class SalesPackage {
	public SalesPackage(String itemReference, double unitPrice, int numberOfSales, double adjustmentFactor) {
		super();
		this.itemReference = itemReference;
		this.unitPrice = unitPrice;
		this.numberOfSales = numberOfSales;
		this.adjustmentFactor = adjustmentFactor;
	}
	public SalesPackage() {
		super();
	}
	private String itemReference;
	private double unitPrice;
	private int numberOfSales;
	private double adjustmentFactor;
	/**
	 * @return the itemReference
	 */
	public String getItemReference() {
		return itemReference;
	}
	/**
	 * @param itemReference the itemReference to set
	 */
	public void setItemReference(String itemReference) {
		this.itemReference = itemReference;
	}
	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}
	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * @return the numberOfSales
	 */
	public int getNumberOfSales() {
		return numberOfSales;
	}
	/**
	 * @param numberOfSales the numberOfSales to set
	 */
	public void setNumberOfSales(int numberOfSales) {
		this.numberOfSales = numberOfSales;
	}
	/**
	 * @return the adjustmentFactor
	 */
	public double getAdjustmentFactor() {
		return adjustmentFactor;
	}
	/**
	 * @param adjustmentFactor the adjustmentFactor to set
	 */
	public void setAdjustmentFactor(double adjustmentFactor) {
		this.adjustmentFactor = adjustmentFactor;
	}
}
