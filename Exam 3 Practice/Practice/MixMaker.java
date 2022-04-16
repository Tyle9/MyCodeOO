public class MixMaker extends AbstractCombine{
    @Override
    public String combine(String s1, String s2) {
        char[] charS1 = s1.toCharArray();   
        char[] charS2 = s2.toCharArray();   

        int len1 = charS1.length;           
        int len2 = charS2.length;           
        int resLen = len1 + len2;           

        char resC[] = resC = new char[resLen];

        int j=0;        
        int k=0;       
        int i=0;       
        
        while(true){
            if(j >= len1 || k >= len2)
                break;
            if(i%2 == 0 && j < len1){
                resC[i] = charS1[j];
                j++;        
            }
            else if(i%2 !=0 && k < len2){
                resC[i] = charS2[k];
                k++;        
            }
            i++;            
        }
        while(i <= (resLen-1)){

            if(k <= (len2-1)){
                resC[i] = charS2[k];
                k++;
            }
            else if(j <= (len1-1)){
                resC[i] = charS1[j];
                j++; }
            i++; }
        String res = String.valueOf(resC);
        res = super.ignoreCase(res);
        return res;     
    }
}