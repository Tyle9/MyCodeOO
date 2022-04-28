public class Builder
{
    private static Builder m_instance;
    
    public static Builder getInstance()
    {
        if (m_instance == null)
        
            m_instance = new Builder();
            return m_instance;
                   
    }
    
    private Builder() {};
    
  
    public IDecision buildWizard()
    {
        IDecision sb1 = new Decision("Do you want to buy a snowboard?");        
        IDecision sb2 = new Decision("Have you snowboarded before?");
        IDecision sb3 = new Decision("Are you an expert?");
        IDecision sb4 = new Decision("Do you like to go fast?");
        
        IDecision dh1 = new Decision("Do you want to buy downhill skis?");
        IDecision dh2 = new Decision("Have you gone skiing before?");
        IDecision dh3 = new Decision("Are you an expert?");
        IDecision dh4 = new Decision("Do you like to jump?");
       
        sb1.setYes(sb2);
        sb1.setNo(dh1);
     
        sb2.setYes(sb3);
        sb2.setNoTerminal("Buy the XG100 model.");
        
        sb3.setYes(sb4);
        sb3.setNoTerminal("Buy the XG200 model.");
        
        sb4.setYesTerminal("Buy the XG300 model.");
        sb4.setNoTerminal("Buy the XG200 model.");
        
        dh1.setYes(dh2);
        dh1.setNoTerminal("you should try skiing someday!.");
        
        dh2.setYes(dh3);
        dh2.setNoTerminal("Buy the ZR100 model.");
        
        dh3.setYes(dh4);
        dh3.setNoTerminal("Buy the ZR200 model.");
        
        dh4.setYesTerminal("Buy the ZR300 model.");
        dh4.setNoTerminal("Buy the ZR200 model. ");
        
        return sb1;
    }       
}