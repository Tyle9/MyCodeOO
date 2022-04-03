public class DropBoth implements IFilter {
    
    public int[] filter(int[] ary) {
            DropLow lowDrop = new DropLow();
            int[] lowDropGrades = lowDrop.filter(ary);
            
            DropHigh highDrop = new DropHigh();
            int[] highDropGrades = highDrop.filter(lowDropGrades);
            
            return highDropGrades;
            
    }
}