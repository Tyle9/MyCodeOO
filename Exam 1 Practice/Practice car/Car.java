public class Car
{
   private Wheel m_frontLeft;
   private Wheel m_frontRight;
   private Wheel m_backLeft;
   private Wheel m_backRight;
   public Car()
   {
       m_frontLeft = new Wheel(30);
       m_frontRight = new Wheel(30);
       m_backLeft = new Wheel(30);
       m_backRight = new Wheel(30);
   }
   public void drive()
   {
       int pressure = m_frontLeft.getPressure() - 5;
       if(pressure < 0) 
           pressure = 0;
       
       m_frontLeft.setPressure(pressure);
       m_frontRight.setPressure(pressure);
       m_backLeft.setPressure(pressure);
       m_backRight.setPressure(pressure);
   }
   public void fillTires()
   {
       m_frontLeft.setPressure(30);
       m_frontRight.setPressure(30);
       m_backLeft.setPressure(30);
       m_backRight.setPressure(30);
   }
   public String toString()
   {
       return "Car (FR: " + m_frontLeft + ", FL: " + m_frontRight + ", BR: " + m_backLeft + ", BL: " + m_backRight + ")";
   }
}
