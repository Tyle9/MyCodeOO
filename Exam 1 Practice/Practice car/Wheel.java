public class Wheel
{
   private int m_pressure;
   
   public Wheel(int pressure)
   {
	   if(pressure < 0) 
           pressure = 0;
       this.m_pressure = pressure;
   }
   public void setPressure(int pressure)
   {
	   if(pressure < 0) 
           pressure = 0;
       this.m_pressure = pressure;
   }
   public int getPressure()
   {
	   
       return this.m_pressure;
   }
   public String toString()
   {
       return "Pressure = " + this.m_pressure;
   }

}