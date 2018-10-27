import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Crickter implements Serializable
{
	transient String name;
	int runs;
	float avg;
	transient int no_of_catches;
	transient String addr;
	
	public Crickter(String name, int runs, float avg, int no_of_catches, String addr)
	{
		this.name = name;
		this.runs = runs;
		this.avg = avg;
		this.no_of_catches = no_of_catches;
		this.addr = addr;
	}
	
	void disp()
	{
		System.out.println(name);
		System.out.println(runs);
		System.out.println(avg);
		System.out.println(no_of_catches);
		System.out.println(addr);
	}
}

public class SerializationTranscient {

	public static void main(String[] args) throws IOException {
		Crickter c = new Crickter("Dhoni", 2000, 23.0f, 250, "Ranchi");
		String path = "C:\\Users\\Ahmad\\eclipse-workspace\\Serialization&Deserialization\\src\\savedobject.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);

	}

}
