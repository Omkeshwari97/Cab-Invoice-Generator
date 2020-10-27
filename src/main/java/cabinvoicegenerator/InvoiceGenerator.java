package cabinvoicegenerator;

public class InvoiceGenerator 
{
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST_PER_KILOMETER = 10;
	private static final double MINIMUM_FARE = 5;
	
	public double calculateFare(double distance, int time) 
	{
		double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
		
		if(totalFare < MINIMUM_FARE)
		{
			return MINIMUM_FARE;
		}
		
		return totalFare; 
	}

	public InvoiceSummary calculateTotalFare(Ride rides[]) 
	{
		double totalFare = 0.0;
		
		for (Ride ride : rides) 
		{
			totalFare = totalFare + calculateFare(ride.getDistance(), ride.getTime());
		}
		
		return new InvoiceSummary(rides.length, totalFare);
	}
}
