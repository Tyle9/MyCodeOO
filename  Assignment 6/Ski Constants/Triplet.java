import java.text.DecimalFormat;

public class Triplet {

        private double beginner;
        private double intermediate;
        private double expert;
       
        public void setBeginner(double b) {
                this.beginner = b;
        }
       
        public void setIntermediate(double i) {
                this.intermediate = i;
        }
        
        public void setExpert(double e) {
                this.expert = e;
        }
        @Override
        public String toString() {
                DecimalFormat df=new DecimalFormat(".00");
                return "Beg: "+df.format(beginner)+" Int: "+df.format(intermediate)+" Exp: "+df.format(expert);
        }
        
        
}