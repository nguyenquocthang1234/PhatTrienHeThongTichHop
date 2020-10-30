package ChuyenBay;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChuyenBayService extends Remote {
	public String information(int sohieu,String ngaygiobay , 
			String noidi, String noiden , String thoigianbay, int tongsoghe, int ghedaban, int ghecontrong) throws RemoteException ;
	public double muave(int sove,double giave) throws RemoteException;
	public double trave(int sove,double giave)throws RemoteException;
}
