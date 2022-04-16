public class Simple extends AbstractCombine{

    @Override
    public String combine(String s1, String s2) {
        String res = s1 + s2;      

        res = super.ignoreCase(res);

        return res;   
    }
}