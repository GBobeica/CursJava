package Curs3;

public class IncrementDecrement {

	public static void main(String[] args) {
		int number =10; //number = number +1 --> 10 = 10+1
		
		//PRE increment
		System.out.println(number);
		System.out.println(++number);
		System.out.println("-------------------");
		
		int number2 = 20;
		//POST increment 
        System.out.println(number2);
        System.out.println(number2++);
        System.out.println(number2);
        
        System.out.println("-------------------");
        //PRE decrement
        int number3 = 30;
        System.out.println(--number3);
        
        
        //POST decrement
        int number4 = 40;
        System.out.println(number4--);
        System.out.println(number4);
	}

}
