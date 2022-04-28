import java.util.Scanner;

public class Decision implements IDecision
{
    private String m_question;
    private IDecision m_yes;
    private IDecision m_no;
    private String m_yesTerminal;
    private String m_noTerminal;
    
    
    public Decision(String question)
    {
        m_question = question;
    }
    
    public void setYes(IDecision yes)
    {
        m_yes = yes;
    }
    
    public void setNo(IDecision no)
    {
        m_no = no;
    }
    
    public void setYesTerminal(String terminal)
    {
        m_yesTerminal = terminal;
    }
    
    public void setNoTerminal(String terminal)
    {
        m_noTerminal = terminal;
    }
    
   private static Scanner scanner = new Scanner(System.in);
    public IDecision ask()
    {
    	IDecision ret = m_no;
       System.out.println(m_question);
       String ansmer=scanner.nextLine();
       
       if (ansmer.equalsIgnoreCase("yes")) {
    	   ret = m_yes;
    	   if(ret==null) {
    		   System.out.println(m_yesTerminal);
    	   }
       }
       else {
    	   if(ret==null) {
    		   System.out.println(m_noTerminal);
    	   }
       }
       return ret;
    }
}