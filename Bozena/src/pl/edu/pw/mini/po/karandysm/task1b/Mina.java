package pl.edu.pw.mini.po.karandysm.task1b;

public abstract class Mina extends ElementPodloza {

	private static int counter = 1;
	private boolean uzbrojona;
	
	protected int id;
	
	public Mina() {
		id = counter;
		counter *= 10;
		uzbrojona = false;
	}
	
	public void armMe() {
		uzbrojona = true;
	}
	
	protected boolean isUzbrojona() {
		return uzbrojona;
	}
}
