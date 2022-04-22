public class WeightedOrderAlg  {

	protected int getPenalty(char ch1) {
	
		
			
			if (ch1 == 'A') {
				int  getPenalty= 1;
		
		}
			if (ch1 == 'C') {
				int  getPenalty= 2;
		
		}
			if (ch1 == 'G') {
				int  getPenalty= 3;
		
		}
			if (ch1 == 'T') {
				int  getPenalty= 4;;
		
		}
		
		
		return ch1;
	}

	public static IDiffAlg getInstance() {
		// TODO Auto-generated method stub
		return (WeightedOrderAlg.getInstance());
	}

	  	
}