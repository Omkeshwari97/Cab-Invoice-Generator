package cabinvoicegenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RideRepository 
{
	Map<String, ArrayList<Ride>> userRides = null;
	
	public RideRepository()
	{
		this.userRides = new HashMap<String, ArrayList<Ride>>();
	}

	public void add(String userId, Ride[] rides) 
	{
		this.userRides.put(userId, new ArrayList<>(Arrays.asList(rides)));
	}

	public Ride[] getRides(String userId) 
	{
		return this.userRides.get(userId).toArray(new Ride[0]);
	}
}
