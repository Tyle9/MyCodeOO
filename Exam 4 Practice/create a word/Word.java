public class Word implements IWord{
    private String word;

    public Word(String word){
        this.word = word;
    }

    @Override
    public String getWord(){
        return word;
    }
}