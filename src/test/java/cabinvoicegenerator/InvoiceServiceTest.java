package cabinvoicegenerator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvoiceServiceTest 
{
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare()
	{
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(25, fare, 0.0);
	}
	
	@Test
	public void givenLessDistanceOrTime_ShouldReturnMinFare()
	{
		InvoiceGenerator invoiceGenerator =new InvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(5, fare, 0.0);
	}
}
