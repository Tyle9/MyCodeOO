public class DiscountCustomer implements IElectricBill {

	   public double calc(int kwh) {
	  return kwh * m_rate * 0.75;
	   }

	}