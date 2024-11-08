package ReadAndWritePropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		String filepath = System.getProperty("user.dir")+"\\Utils\\Mypropertyfile.properties";
		
		FileInputStream file = new FileInputStream(filepath);
		
		properties.load(file);
		
		file.close();
		
		
		//Read data from properties file // only values read
		String appleValue =properties.getProperty("apple");
		String satyaValue =properties.getProperty("satya");
		String reddyValue =properties.getProperty("reddy");
		
		System.out.println(appleValue);
		System.out.println(satyaValue);
		System.out.println(reddyValue);

		//capture all key only from properties file
		Set<String> 	keys=properties.stringPropertyNames();
		System.out.println("only keys"+keys);
		
		//or
		Set<Object> allkeys=properties.keySet();
		System.out.println("only keys"+allkeys);
		
		//capture all the values 
		Collection<Object> allvalues=properties.values();
		System.out.println("only vlues"+allvalues);
		
		//read all the properties and their values 
		for(String myKeys :properties.stringPropertyNames())
		{
		System.out.println(myKeys+"  "+properties.getProperty(myKeys));
		}
	}

	
}
