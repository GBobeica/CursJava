package Curs7;

import java.io.IOException;

public class TestLegume {

	public static void main(String[] args) throws IOException {
		
		ListaLegume obj = new ListaLegume();
		//obj.writeProperties();
		obj.readPropertiesFile("morcovi");
		obj.readPropertiesFile("rosii");
		obj.readPropertiesFile("castraveti");
	}

}
