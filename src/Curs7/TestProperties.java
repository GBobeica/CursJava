package Curs7;

import java.io.IOException;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		//obj.writeProperties();
		obj.readPropertiesFile("username");
		obj.readPropertiesFile("email");
		obj.readPropertiesFile("address");

	}

}
