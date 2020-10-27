package cabinvoicegenerator;

public class InvoiceSummary 
{

	private int numOfRides;
	private double totalFare;
	private double averageFare;

	public InvoiceSummary(int numOfRides, double totalFare) 
	{
		this.numOfRides = numOfRides;
		this.totalFare = totalFare;
		this.averageFare = totalFare/numOfRides;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}
		
		if(o == null || getClass() != o.getClass())
		{
			return false;
		}
		
		InvoiceSummary invoiceSummaryObj = (InvoiceSummary) o;
		
		return numOfRides == invoiceSummaryObj.numOfRides &&
							Double.compare(invoiceSummaryObj.totalFare, totalFare) == 0 &&
							Double.compare(invoiceSummaryObj.averageFare, averageFare) == 0;
	}

}
