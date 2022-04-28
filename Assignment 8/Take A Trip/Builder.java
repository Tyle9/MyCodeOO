public class Builder {
	
	private static Builder m_instance;
	public static Builder getInstance() {
		if (m_instance == null)
		    m_instance = new Builder();
		return m_instance;
		            
		        }
	private Builder() {};

	public ITrip createTrip() {
		
		ComplexTrip t1 = new ComplexTrip("Home");
		ComplexTrip t2 = new ComplexTrip("North Adams");
		ComplexTrip t3 = new ComplexTrip("Pittsfield");
		t1.add(t2).add(t3);
		
		ComplexTrip t4 = new ComplexTrip("MassMoCA");
		ComplexTrip t5 = new ComplexTrip("MCLA");
		t2.add(t4).add(t5);
		
		ITrip t6 = new ComplexTrip("Science Museum");
		ITrip t7 = new ComplexTrip("Baseball Game");
		t3.add(t6).add(t7);
		
		ITrip t8 = new ComplexTrip("Lewitt Exhibit");
		ITrip t9 = new ComplexTrip("Cafe");
		t4.add(t8).add(t9);
		
		return t1;
		
		}		
	}