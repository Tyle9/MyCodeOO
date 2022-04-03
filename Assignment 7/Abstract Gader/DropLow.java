public class DropLow implements IFilter {
   
    public int[] filter(int[] ary) {
            int lowGrade = 0;
            for(int i =0; i < ary.length; i++) {
                    if(i == 0 || lowGrade > ary[i]) {
                            lowGrade = ary[i];
                    }
            }
            int[] newAry = new int[ary.length-1];
            for(int index = 0; index < ary.length; index++) {
                    if(ary[index] == lowGrade) {
                            for(int j=index+1; j< ary.length; j++) {
                                    newAry[j-1] = ary[j];
                            }
                            break;
                    }
                    else {
                            newAry[index] = ary[index];
                    }
            }
            return newAry;
    }
}