package pl.edu.pw.mini.po.karandysm.grzyby;

import pl.edu.pw.mini.po.karandysm.las.Las;

public class MuchomorDemonstrator {
	
	public static void main(String[] args) {
		Muchomor szarawy = new MuchomorSzarawy();
		Muchomor sromot = new MuchomorSromotnikowy();
		Muchomor kolcz = new MuchomorKolczastoglowy();
		Muchomor cesar = new MuchomorCesarski();
		System.out.println(szarawy);
		System.out.println(sromot);
		System.out.println(kolcz);
		System.out.println(cesar);
		
		Las las = new Las(40, 40);
		las.print();
	}
}
