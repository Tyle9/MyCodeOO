import java.util.*;

public class ComplexTrip extends SimpleTrip {

	private List<ITrip> m_trips;
	
	public ComplexTrip(String location) {
		super(location);
		m_trips = new ArrayList<ITrip>();
	}
	
	
	public ComplexTrip add(ITrip t) {
		m_trips.add(t);
		return this;
	}
	
	@Override
	public void travel() {
		super.travel();
		for(ITrip t: m_trips) 
		{
			t.travel();
		}
	}
	
}
