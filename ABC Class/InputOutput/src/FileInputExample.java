import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputExample {
	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\Ahmad\\eclipse-workspace\\InputOutput\\input.txt";
		String path2 = "C:\\Users\\Ahmad\\eclipse-workspace\\InputOutput\\output.txt";
		
		FileInputStream fis = new FileInputStream(path1);
		FileOutputStream fos = new FileOutputStream(path2);
		
		int temp;
		while((temp = fis.read()) != -1)
		{
			fos.write(temp);
		}
		
	}

}
