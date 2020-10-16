package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class bai5serverSocket {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(6666);
		System.out.println("server đã mở cổng và chờ client kết nối");
		Socket socket =serverSocket.accept();
		DataInputStream dataInputStream= new DataInputStream(socket.getInputStream());
		
		DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
		//doc data tu client 
		String str =dataInputStream.readUTF();
		System.out.println("chuoi tu Client :"+str);
		//tra du lieu ve
		String reverse = new StringBuffer(str).reverse().toString();
		dataOutputStream.writeUTF(reverse);
		dataOutputStream.flush();
		dataInputStream.close();
		dataOutputStream.close();
		socket.close();
		serverSocket.close();
	}

}
