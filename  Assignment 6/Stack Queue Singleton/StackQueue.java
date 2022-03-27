import java.util.*;
class StackQueue
{
    static StackQueue instance = null;
    
    public static StackQueue getInstance()
    {
        if (instance == null)
            instance = new StackQueue();
        return instance;
    }
    public void pushOnStack(String s,List<String> list)
    {
        list.add(s);
    }
    public String popFromStack(List<String> list)
    {
        
        return list.remove(list.size()-1);
    }
    public void addToQueue(String s, List<String> list)
    {
        list.add(s);
    }
    public String removeFromQueue(List<String> list)
    {
        return list.remove(0);
    }
}