package ChuyenBay;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ChuyenBayServer {

	public static void main(String[] args) throws RemoteException {
		// Tạo cổng server
		LocateRegistry.createRegistry(7777);
		try {
			Naming.rebind("rmi://localhost:7777/MuaVeMayBayService", new ChuyenBayImpl());
			System.out.println("Xin Chào");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
