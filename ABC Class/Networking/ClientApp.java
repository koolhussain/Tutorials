import java.io.*;
import java.net.*;
import java.util.*;

class ClientApp 
{
	public static void main(String[] args) throws Exception
	{
		Socket csoc = new Socket("127.0.0.1",10001);
		OutputStream os = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner scan = new Scanner(System.in);
		String msg = scan.nextLine();
		dos.writeUTF(msg);
	}
}
