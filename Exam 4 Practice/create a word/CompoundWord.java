public class CompoundWord implements IWord {
	
	 private IWord word1;
	 private IWord word2;

	    public CompoundWord(IWord w1, IWord w2){
	        word1 = w1;
	        word2 = w2;
	    }

	    @Override
	    public String getWord(){
	        return word1.getWord() + word2.getWord();
	    }
	}
