import java.io.*;
import java.net.*;
import java.util.*;
class ServerAppMP 
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket listner = new ServerSocket(10001);
		System.out.println("Server is Ready");
		Socket ssoc = listner.accept();
		InputStream is = ssoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		OutputStream os = ssoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=3; i++)
		{
			String msg1 = dis.readUTF();
			System.out.println(msg1);
			String msg2 = scan.nextLine();
			dos.writeUTF(msg2);
		}
	}
}
