package ReadAndWritePropertiesFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		properties.setProperty("satya", "911353435282");
		properties.setProperty("reddy", "6389789737");
		properties.setProperty("Apple", "7479874334");
		
		String filepath = System.getProperty("user.dir")+"\\Utils\\Mypropertyfile.properties";
		
		FileOutputStream outputfile = new FileOutputStream(filepath);
		properties.store(outputfile, "my sample data in properties file");
		
		outputfile.close();
		
		System.out.println("Properties has been written into :"+filepath);
		
		
		
	}

}
