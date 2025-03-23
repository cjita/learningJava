import java.io.FileWriter;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) {
		
		try(FileWriter writer = new FileWriter("test.txt")){
		    writer.write("i like testing");
		    System.out.println("Written successflly");
		}
		catch(IOException e){
		    System.out.println("Could not write file not found");
		}
	}
}
