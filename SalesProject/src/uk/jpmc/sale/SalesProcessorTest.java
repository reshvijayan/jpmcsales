/**
 * 
 */
package uk.jpmc.sale;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Reshma
 *
 */
public class SalesProcessorTest {

		SalesProcessor sp=new SalesProcessor();
		SalesPackage spkg;
	/**
	 * Test method for {@link uk.jpmc.sale.SalesProcessor#ProcessSale(uk.jpmc.sale.SalesPackage)}.
	 */
	@Test
	public void testProcessSale() {
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(2, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(3, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(4, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(5, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Orange");
		spkg.setUnitPrice(20);
		spkg.setNumberOfSales(4);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(6, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Radio");
		spkg.setUnitPrice(134);
		spkg.setNumberOfSales(2);
		spkg.setAdjustmentFactor(-5);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(7, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(7);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(8, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Orange");
		spkg.setUnitPrice(20);
		spkg.setNumberOfSales(6);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(9, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Toys");
		spkg.setUnitPrice(55);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(-3);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(10, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(11, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(12, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(13, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(14, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(15, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(1, sp.getMap().size());
	}

}
