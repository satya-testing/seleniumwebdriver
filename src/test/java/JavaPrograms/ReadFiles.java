package JavaPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:\\Users\\Satyanarayana.patil\\OneDrive - Entain Group\\Desktop\\New folder\\notes.txt");	
		
		Scanner sc = new Scanner(file);
		
		while (sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
			
	}

}
