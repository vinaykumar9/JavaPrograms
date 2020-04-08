import java.io.File;
import java.io.IOException;

public class SampleFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("files .............");
		File f = new File("C:\\Projects\\files\\data5.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
