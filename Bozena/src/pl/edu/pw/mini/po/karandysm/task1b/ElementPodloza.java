package pl.edu.pw.mini.po.karandysm.task1b;

import java.util.Random;

public abstract class ElementPodloza {
	
	protected static Random random = new Random();
	
	protected boolean ekologiczna;
	
	protected void ustawEkologicznosc(boolean eko) {
		ekologiczna = eko;
	}
	
	public void pressMe() {
		System.out.println("Chrup");
	}
	
}
