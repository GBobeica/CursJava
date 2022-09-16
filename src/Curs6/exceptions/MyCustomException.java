package Curs6.exceptions;

public class MyCustomException extends Exception {
	
	public MyCustomException(String mesaj) {
		
		super(mesaj);
		// this -> face referinta catre obiectul clasei in care se afla
		// super -> face referinta catre obiectul clasei parine
		
		
		//o variabila care se cheama : nume
		
		// in aceeasi clasa : this.nume
		//catre clasa parinte : super.nume
		
		
	}

}
