public class DropHigh implements IFilter {
    
    public int[] filter(int[] ary) {
            int highGrade = 0;
            for(int i =0; i < ary.length; i++) {
                    if(i == 0 || highGrade < ary[i]) {
                            highGrade = ary[i];
                    }
            }
            int[] newAry = new int[ary.length-1];
            for(int index = 0; index < ary.length; index++) {
                    if(ary[index] == highGrade) {
                            for(int j=index+1; j < ary.length; j++) {
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