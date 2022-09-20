package Curs7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {
	
	public void writeToTxtFile(String text)  {
	
		try { 
		FileWriter myWriter = new FileWriter("filename.txt");
		
		myWriter.write(text);
		myWriter.close();
		System.out.println("Sucessfully wrote to file!");
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void readTxtFile() {
		
		File file = new File("filename.txt");
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
