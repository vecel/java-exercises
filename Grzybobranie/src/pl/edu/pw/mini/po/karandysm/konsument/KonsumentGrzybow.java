package pl.edu.pw.mini.po.karandysm.konsument;

import java.util.Random;

import pl.edu.pw.mini.po.karandysm.grzyby.Muchomor;
import pl.edu.pw.mini.po.karandysm.las.Las;

public class KonsumentGrzybow {
	
	private Las las;
	private boolean zywy = true;
	
	public KonsumentGrzybow(Las las) {
		this.las = las;
	}
	
	public void konsumujGrzyby() {
		Random random = new Random();
		int n = random.nextInt(50, 101);
		
		for (int i = 0; i < n; ++i) {
			Muchomor muchomor = las.getMuchomor();
			if (muchomor != null) {
				muchomor.ugotuj();
				zjedz(muchomor);
			}
			if (!zywy)
				break;
		}
	}
	
	private void zjedz(Muchomor grzyb) {
		if (grzyb.isTrujacy()) {
			System.out.println("Uuuups!");
			zywy = false;
		}
	}
	
}
