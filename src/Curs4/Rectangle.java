package Curs4;

public class Rectangle {
	//variabile
	private int lenght;
	private int width;
	
	//constructor
	public Rectangle() {} // constructor default --> Java il seteaza automat daca nu il punem noi
	
	//constructor cu parametri
	public Rectangle(int lt, int wd) {
		setLenght(lt);
		setWidth(wd);
		
	}
	
	//metode getter&setter
	public int getLenght() {
		return lenght;
	}
	private void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWidth() {
		return width;
	}
	private void setWidth(int width) {
		this.width = width;
	}
	
	//int area;
	
	public int calculateArea() {
		return  lenght * width; 
		//System.out.println(lenght * width);
	}
	
	

}
