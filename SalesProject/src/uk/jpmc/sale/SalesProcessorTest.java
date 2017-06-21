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
		assertEquals(16, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(17, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(18, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Pen");
		spkg.setUnitPrice(1);
		spkg.setNumberOfSales(20);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(19, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(20, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(21, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(22, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Pen");
		spkg.setUnitPrice(1);
		spkg.setNumberOfSales(30);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(23, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(24, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(25, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(26, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(27, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(28, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(29, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Table");
		spkg.setUnitPrice(50);
		spkg.setNumberOfSales(1);
		spkg.setAdjustmentFactor(2);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(30, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(31, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(32, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(33, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(34, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(35, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(36, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Table");
		spkg.setUnitPrice(50);
		spkg.setNumberOfSales(2);
		spkg.setAdjustmentFactor(-5);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(37, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(38, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(39, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(40, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(41, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("IronBox");
		spkg.setUnitPrice(15);
		spkg.setNumberOfSales(1);
		spkg.setAdjustmentFactor(-1);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(42, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(43, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(44, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(45, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(46, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(47, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("IronBox");
		spkg.setUnitPrice(20);
		spkg.setNumberOfSales(10);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(48, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Apple");
		spkg.setUnitPrice(12);
		spkg.setNumberOfSales(3);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(49, sp.getMap().size());
		
		spkg=new SalesPackage();
		spkg.setItemReference("Bottle");
		spkg.setUnitPrice(5);
		spkg.setNumberOfSales(6);
		spkg.setAdjustmentFactor(0);
		assertEquals(false, sp.processSale(spkg));
		assertEquals(50, sp.getMap().size());
	}

}
