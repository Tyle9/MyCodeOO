public class SolidConstructionHouse extends House {
    public SolidConstructionHouse(int sqrFt) {
        super(sqrFt);
    }

    public SolidConstructionHouse() {
        super();
    }

    public double estimate() {
        return super.estimate() * 1.25;
    }

}