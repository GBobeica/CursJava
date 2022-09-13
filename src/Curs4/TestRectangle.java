package Curs4;

public class TestRectangle {

	public static void main(String[] args) {
		
		// clasa numeObiect = new (instantiaza clasa ) constructorul(Rectangle(()
		
		Rectangle obj = new Rectangle();
		
		
		Rectangle obj2 = new Rectangle(5, 5); 
		//obj.setLenght(24);
		//obj.setWidth(35);
		
		

		obj2.calculateArea();
		System.out.println(obj2.calculateArea());
	}

}
