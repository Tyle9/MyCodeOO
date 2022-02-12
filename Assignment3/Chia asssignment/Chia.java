public class Chia {
	private String mood;
	public Chia(){
		mood="Happy";
				}
	public void talkToChia(){
		if(mood.equals("Sad")||mood.equals("Terrified"))
			mood="Happy";
				}
	public void yellAtChia(){
		if(mood.equals("Happy")||mood.equals("Terrified"))
			mood="Sad";
		}
	public void singToChia(){
		if(mood.equals("Happy")||mood.equals("Sad"))
			mood="Terrified";
			}
	public String getMood(){
		return mood;
		}
}