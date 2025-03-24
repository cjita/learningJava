import java.io.BufferedReader;
import java.io.FileReader;

public class Main
{
	public static void main(String[] args) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("test.txt"))){
		    String line;
		    
		    while((line = reader.readLine())!=null){
		    System.out.println(line);
		    }
		}
		catch(Exception e){
		    System.out.println(e);
		
		}
	}
}
