import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class file {
	public static void writeToMyFile(String string,String uri) {
		
		try {
			Formatter formatter = new Formatter(uri);
			formatter.format(string);
			formatter.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public static String readFromFile(String uri) {
		String string = "";
		
		try {
			Scanner scanner = new Scanner(new File(uri));
			while(scanner.hasNext()) {
				string = string.concat(scanner.nextLine());
				string = string.concat("\n");
	
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return string;
	}
	
}
