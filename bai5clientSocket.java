package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class bai5clientSocket {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket= new Socket("localhost",6666);
		System.out.println("đã kết nối vào cổng");
		DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
		
		DataOutputStream dataOutputStream =new DataOutputStream(socket.getOutputStream());
		
		Scanner scanner =new Scanner(System.in);
		//truyen du lieu len server
		System.out.println("Nhap chuoi gui len server:");
		String str = scanner.nextLine();
		dataOutputStream.writeUTF(str);
		dataOutputStream.flush();
		//doc du lieu tu server truyen ve
		String str2 =dataInputStream.readUTF();
		System.out.println("chuoi tu server: "+str2);
		dataInputStream.close();
		dataOutputStream.close();
		socket.close();
	}

}
