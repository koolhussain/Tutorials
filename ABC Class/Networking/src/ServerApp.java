import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

	public static void main(String[] args) throws Exception {
		ServerSocket listner = new ServerSocket(4000);
		System.out.println("Server is ready to accept Request");
		Socket ssoc = listner.accept();
		InputStream is = ssoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		String msg = dis.readUTF();
		System.out.println(msg);

	}

}
