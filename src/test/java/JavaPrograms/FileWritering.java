package JavaPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritering {

	public static void main(String[] args) throws IOException {
			
		String content = "this is written using filewriter";
		String filepath = "C:\\Users\\Satyanarayana.patil\\OneDrive - Entain Group\\Desktop\\New folder\\notes.txt" ;
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));
		bw.write(content);
		bw.close();	
		
		System.out.println("Successfully written into the file");
			
	}

}
