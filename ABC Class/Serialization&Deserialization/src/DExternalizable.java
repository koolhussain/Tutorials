import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

class Crickter implements Externalizable
{
	String name;
	int runs;
	float avg;
	int no_of_catches;
	String addr;
	
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
	
	public void writeExternal(ObjectOutput oo) throws IOException {
		oo.writeInt(runs);
		oo.writeFloat(avg);
	}
	
	public void readExternal(ObjectInput oi) throws IOException {
		runs = oi.readInt();
		avg = oi.readFloat();
	}
}

public class DExternalizable {

	public static void main(String[] args) throws IOException, Exception {
		String path = "C:\\Users\\Ahmad\\eclipse-workspace\\Serialization&Deserialization\\src\\savedobject.txt";
		Crickter c = new Crickter("Dhoni", 2000, 25.0f, 250, "Ranchi");
		FileInputStream fis =  new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Crickter x = (Crickter)ois.readObject();
		x.disp();

	}

}
