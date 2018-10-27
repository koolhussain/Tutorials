import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\Ahmad\\eclipse-workspace\\InputOutput\\input.txt";
		String path2 = "C:\\Users\\Ahmad\\eclipse-workspace\\InputOutput\\output.txt";
		
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		
		int temp;
		
		while((temp = fr.read()) != -1)
		{
			fw.write(temp);
		}
		fw.flush();
	}
}
