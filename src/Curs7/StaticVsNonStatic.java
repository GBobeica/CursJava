package Curs7;

public class StaticVsNonStatic {
	
	
	
	public String nume = "Oana";
	public static String nume2 = "ioana";

	public static void main(String[] args) {
		StaticVsNonStatic obiect = new StaticVsNonStatic();
		
		System.out.println(obiect.nume);
		
		System.out.println(nume2);
		
		System.out.println(obiect.nume2);
		
		
		StaticVsNonStatic obiect2 = new StaticVsNonStatic();
		nume2 = "George";
		System.out.println(obiect2.nume2);
		System.out.println(obiect.nume2);
		obiect.printeazaNume();
		

	}

	public void printeazaNume() {
		System.out.println(nume);
		
		
	}
	
	public static void printeazaNumeStatic() {
		System.out.println(nume2);
	}
	
}
