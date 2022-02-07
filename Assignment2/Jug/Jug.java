public class Jug {
    
    private String liquidType;
    private int gallons;
    
    public Jug(){
        liquidType = "Water";
        gallons = 0;
    }
    
    public Jug(String liquidType, int gallons) {
            super();
            this.liquidType = liquidType;
            this.gallons = gallons;
    }

    public static void main(String[] args) {
            
            Jug j1 = new Jug();
            System.out.println(j1.isEmpty());
            
            Jug j2 = new Jug("Petrol", 10);
            System.out.println(j2.getLiquidType());
            System.out.println(j2.getGallons());
            System.out.println(j2.isEmpty());
            
    }
   
    public void setGallons(int gallons) {
        this.gallons = gallons;
    }
    
    public int getGallons() {
            return gallons;
    }

    public String getLiquidType() {
        return liquidType;
    }   
    
    public boolean isEmpty() {
            return this.gallons == 0;
    }

}
