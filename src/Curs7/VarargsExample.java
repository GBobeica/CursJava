package Curs7;

public class VarargsExample {

	public static void main(String[] args) {
		
		VarargsExample obj = new VarargsExample();
			
		//obj.printCeva("Ceva");
		obj.printVarargs("unu", "trei", "patru");
		
		System.out.println("===============");
            obj.printGenerics(12, "Text", 3);
		
		
	}
	
	
	public void printCeva(String txt) {
		System.out.println(txt);	
		
	}
	
	public void printVarargs(String...values) {
		
		for (String element : values) {
			System.out.println(element);
		}
		
		
		
	}
	
	public <T> void printGenerics(T...values) {
		
		for (T element : values) {
			System.out.println(element);
		}
		
	}

}
