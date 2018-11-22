import java.io.*;
import java.net.*;

class ServerApp 
{
	public static void main(String[] args) throws Exception 
	{
		ServerSocket listner = new ServerSocket(10001);
		System.out.println("Server is ready to accept Request");
		Socket ssoc = listner.accept();
		InputStream is = ssoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		String msg = dis.readUTF();
		System.out.println(msg);
	}
}
