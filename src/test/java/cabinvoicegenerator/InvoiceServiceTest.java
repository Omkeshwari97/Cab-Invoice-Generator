package cabinvoicegenerator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest 
{
	InvoiceGenerator invoiceGenerator = null;
	
	@Before
	public void setUp()
	{
		invoiceGenerator = new InvoiceGenerator();
	}
	
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare()
	{
		double distance = 2.0;
		int time = 5;
		
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(25, fare, 0.0);
	}
	
	@Test
	public void givenLessDistanceOrTime_ShouldReturnMinFare()
	{
		double distance = 0.1;
		int time = 1;
		
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(5, fare, 0.0);
	}
	
	/*
	 * @Test public void givenMultipleRides_ShouldReturnTotalFare() { Ride rides[] =
	 * { new Ride(3.0, 5), new Ride(0.1, 1) };
	 * 
	 * double fare = invoiceGenerator.calculateTotalFare(rides); assertEquals(40,
	 * fare, 0.0); }
	 */
	
	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary()
	{
		Ride rides[] = { new Ride(3.0, 5),
						 new Ride(0.1, 1)			
						};
		
		InvoiceSummary summary = invoiceGenerator.calculateTotalFare(rides);
		InvoiceSummary expectedSummary = new InvoiceSummary(2, 40.0);
		assertEquals(summary, expectedSummary);
	}
	
	@Test
	public void givenUserIdAndRides_ShouldReturnInvoiceSummary()
	{
		String userId = "101";
		

		Ride rides[] = { new Ride(3.0, 5),
						 new Ride(0.1, 1)			
						}; 
		
		invoiceGenerator.addRides(userId, rides);
		InvoiceSummary summary = invoiceGenerator.calculateTotalFare(rides);
		InvoiceSummary expectedSummary = new InvoiceSummary(2, 40.0);
		assertEquals(summary, expectedSummary);
	}
}
