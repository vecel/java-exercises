package pl.edu.pw.mini.po.karandysm.task1b;

import pl.edu.pw.mini.po.karandysm.task1b.bozena.Bozena;
import pl.edu.pw.mini.po.karandysm.task1b.bozena.Destroyable;
import pl.edu.pw.mini.po.karandysm.task1b.pole.Podloze;

public class Demonstrator {
	
	public static void main(String[] args) {
		
		Podloze podloze = new Podloze();
		Destroyable bozena = new Bozena(podloze);
		
//		System.out.println(podloze);
		
		for (int i = 0; i < 50; i++) {
			System.out.println(i);
			bozena.destroyMines();
		}
		
	}
}
