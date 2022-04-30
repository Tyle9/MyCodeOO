import java.util.ArrayList;

public class Sentence {

    private ArrayList<IWord> words;

    public Sentence(){
         words = new ArrayList<IWord>();
    }

    public Sentence add(IWord word){
        words.add(word);
        return this;

    }
    
    public String getSentence(){
        String result = "";
        for(IWord word:words)
        	result += word.getWord()+" ";
        String cap = result.substring(0, 1).toUpperCase() + result.substring(1);
        
        return cap.trim()+".";
    }
}