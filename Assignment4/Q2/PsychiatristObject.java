package Q2;

public class PsychiatristObject {
	
	public void examine(MoodyObject moodObject) {
		System.out.println("How are you feeling today?");
		moodObject.queryMood();
	}
	
	public void observe(MoodyObject moodObject) {
		moodObject.expressFeelings();
		System.out.println("Observation: "+ moodObject.toString());
	}
    
	public static void main(String args[]) {
		PsychiatristObject po = new PsychiatristObject();
		HappyObject mo1 = new HappyObject();
		SadObject mo2 = new SadObject();
		po.examine(mo1);
		System.out.println();
		po.observe(mo1);
		System.out.println();
		po.examine(mo2);
		System.out.println();
		po.observe(mo2);
		System.out.println();
	}
}
