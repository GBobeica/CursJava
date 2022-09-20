package Curs7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	public void writeProperties() throws IOException {
		
		try {
			
		OutputStream outStream = new FileOutputStream("test.properties");
		
		Properties file = new Properties();
		file.setProperty("username", "oana");
		file.setProperty("password", "oana123");
		file.setProperty("email", "oana@oana.ro");
		
		
		file.store(outStream, "Am salvat fisierul test.properties");
		System.out.println(file);
		
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	
	
	}
	
	public void readPropertiesFile(String key)  throws IOException {
		
		try {
		InputStream inputStream = new FileInputStream("test.properties");
				Properties file = new Properties();
			file.load(inputStream);	
			
			System.out.println(file.getProperty(key));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
