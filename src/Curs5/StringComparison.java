package Curs5;

public class StringComparison {

	public static void main(String[] args) {
		
		String unu = "Java";
		String doi = "Automation";
		String trei = "Java";
		String patru = new String("Java");
		
		
		System.out.println(" == ");
		System.out.println(unu == doi);
		System.out.println("equals");
		System.out.println(unu.equals(doi));
		
		
		System.out.println("===============");
		
		System.out.println("==");
		System.out.println(unu == trei);
		System.out.println("equals");
		System.out.println(unu.equals(doi));

		System.out.println("===============");
		
		
		System.out.println("==");
		System.out.println(unu == patru);
		System.out.println("equals");
		System.out.println(unu.equals(doi));
	}

}
