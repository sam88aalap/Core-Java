import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	
	public static void main(String[] args) {
		String str= "\nthis is the data to be written";
		FileOutputStream stream= null;
		try {
			stream=new FileOutputStream("filewrite",true);
			stream.write(str.getBytes());
			System.out.print("Data written in file");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
