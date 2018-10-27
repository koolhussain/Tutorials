import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderExample {
	public static void main(String[] args) throws IOException {
		
		String path1 = "C:\\Users\\Ahmad\\eclipse-workspace\\InputOutput\\input.txt";
		String path2 = "C:\\Users\\Ahmad\\eclipse-workspace\\InputOutput\\output.txt";
		
		FileReader fr = new FileReader(path1);
		BufferedReader br = new BufferedReader(fr);
		String temp;
		FileWriter fw = new FileWriter(path2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		while((temp = br.readLine()) != null) {
			bw.write(temp);
		}
		bw.flush();
	}
}
