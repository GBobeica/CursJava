package Curs5;

public class Produs {
	
	
	private String nume;
	private int pret;
	
	
	public Produs(String nume, int pret) {
		
		setNume(nume);
		setPret(pret);
	}
	
	public String getNume() {
		return nume;
	}
	private void setNume(String nume) {
		this.nume = nume;
	}
	public int getPret() {
		return pret;
	}
	private void setPret(int pret) {
		this.pret = pret;
	}
	
	
	
	

}
