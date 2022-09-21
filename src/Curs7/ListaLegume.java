package Curs7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ListaLegume {
	
	
	public void writeProperties() throws IOException {
		
		try {
			
		OutputStream outStream = new FileOutputStream("lista.legume");
		
		Properties file = new Properties();
		file.setProperty("morcovi", "58");
		file.setProperty("rosii", "44");
		file.setProperty("castraveti", "33");
		
		file.store(outStream, "Am salvat lista de legume/calorii");
		System.out.println();
		
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}
		
	
	}

	public void readPropertiesFile(String key) throws IOException {
	
		
		try {
			
			InputStream inputStream = new FileInputStream("lista.legume");
					Properties file = new Properties();
			file.load(inputStream);
			
			System.out.println(file.getProperty(key));
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
