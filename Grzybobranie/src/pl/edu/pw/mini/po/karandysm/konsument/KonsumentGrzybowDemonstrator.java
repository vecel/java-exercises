package pl.edu.pw.mini.po.karandysm.konsument;

import pl.edu.pw.mini.po.karandysm.las.Las;

public class KonsumentGrzybowDemonstrator {
	
	public static void main(String[] args) {
		Las las = new Las(30, 2);
		las.print();
		KonsumentGrzybow konsumentGrzybow = new KonsumentGrzybow(las);
		konsumentGrzybow.konsumujGrzyby();
	}
}
