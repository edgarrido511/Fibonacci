import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;


public class Manager {
static File file = new File("test.dat");
	public void ejecutar() {
		try {
			write();
			read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void write() throws IOException {
			
	    FileWriter fileWriter 	= new FileWriter(file);
	    PrintWriter printWriter = new PrintWriter(fileWriter);

	    printWriter.print("Todo esta en orden"
	    		+ "");	    
	    printWriter.close();
	}
	
	public static void read()  throws IOException
    { 
       
        Path fileName = Path.of(file.getPath());
 
        String str = Files.readString(fileName);
 
        System.out.println(str);
    }	

}