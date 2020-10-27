package cabinvoicegenerator;

public class Ride 
{

	private double distance;
	private int time;

	public Ride(double distance, int time) 
	{
		this.setDistance(distance);
		this.setTime(time);
	}

	public double getDistance() 
	{
		return distance;
	}

	public void setDistance(double distance) 
	{
		this.distance = distance;
	}

	public int getTime() 
	{
		return time;
	}

	public void setTime(int time) 
	{
		this.time = time;
	}

}
