import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
	public static void main(String[] args) {
		DataOutputStream stream= null;
		
		try {
			stream = new DataOutputStream(new FileOutputStream("dataIO"));
			stream.writeInt(10);
			stream.writeLong(123L);
			stream.writeFloat(2.5f);
			stream.writeDouble(22.5);
			stream.writeChar('A');
			System.out.println("Data written in file");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(stream != null) {
				try {
					stream.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
