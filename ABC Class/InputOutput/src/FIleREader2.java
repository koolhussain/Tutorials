import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleREader2 {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\Ahmad\\eclipse-workspace\\InputOutput\\input.txt";
		String path2 = "C:\\Users\\Ahmad\\eclipse-workspace\\InputOutput\\output.txt";

		FileReader fr = null;
		FileWriter fw = null;
		int temp;

		try {
			fr = new FileReader(path1);
			fw = new FileWriter(path2);
			while((temp=fr.read()) != -1) {
				fw.write(temp);
			}
		} catch (IOException e) {
			System.out.println("Some Problem Occured");
		}
		finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				System.out.println("Some Problem Occured");
			}
			
		}
		

	}
}
