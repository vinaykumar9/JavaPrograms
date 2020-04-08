import java.io.File;
import java.io.IOException;

public class CreatingFile {
	
	public static void main(String [] args){
		
		
		System.out.println("creation of nw file");
		
		File myObj = new File("C:\\Projects\\files\\FileHandlingNewFilef1.txt"); 
			try {
			// Creating an object of a file
		
			if (myObj.createNewFile()) {
			System.out.println("File created: " + myObj.getName());
			} else {
			System.out.println("File already exists.");
			}
			} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			}
			
			
		//1
			System.out.println("file is present in the specific location");
                  System.out.println(myObj.exists());
                  
          //2
                  System.out.println("file name");
                  System.out.println(myObj.getName());
                  
           //3
                  System.out.println("we can write into that file");
                  System.out.println(myObj.canWrite());
                  
                  
           //4
               // Returning the path of the file 
                  System.out.println("Absolute path: " + myObj.getAbsolutePath());
                  
             //5
               // Displaying whether the file is readable or not
                  System.out.println("Readable " + myObj.canRead());  
                  
               //6
               // Returning the length of the file in bytes
                  System.out.println("File size in bytes " + myObj.length());  
                  
                  
                  
                  
             
			
			
			}
			}
	


