import java.util.Comparator;

public class Stadium {

	private String m_name;
    private String m_city;
    private int m_capacity;
    private boolean m_kidzone;
	
    
    public Stadium(String name, String city, int capacity, boolean kidzone)
    {
        m_name = name;
        m_city = city;
        m_capacity = capacity;
        m_kidzone = kidzone;
    }

    public String getName()
    { return m_name; }
    
    public String getCity()
    { return m_city; }
    
    public int getCapacity()
    { return m_capacity; }
    
    public boolean getKidzone()
    { return m_kidzone; }
    
    @Override
    public String toString()
    { 
        String kz = getKidzone() ? "has a" : "does not have a";
        return String.format("%s, located in %s, %s kidzone.", getName(), getCity(), kz); 
    
    }

    static class ByKidZoneCityName implements Comparator<Stadium>
    {
      // your code goes here...
        public static ByKidZoneCityName getInstance(){
            return new ByKidZoneCityName();
        }
        @Override
        public int compare(Stadium n1,Stadium n2){
            int b = n2.getKidzone() ? 1 : 0;
            int a = n1.getKidzone() ? 1 : 0;
            if(b - a != 0) 
                return b - a;  

            int c = n1.getCity().compareTo(n2.getCity());
            if ( c != 0)
                return c; 
            int d =  n1.getName().compareTo(n2.getName());
            return  d; 
        }
    }
}