package ChuyenBay;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChuyenBayImpl extends UnicastRemoteObject implements ChuyenBayService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected ChuyenBayImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String information(int sohieu, String ngaygiobay, String noidi, String noiden, String thoigianbay, int tongsoghe,
			int ghedaban, int ghecontrong) throws RemoteException {
		// TODO Auto-generated method stub
		return " Số hiệu :"+sohieu+"\n Ngày và giờ :"+ngaygiobay+"\n Nơi đi :"+noidi+"\n Nơi Đến :"+noiden+"\n Thời Gian Bay :"
				+thoigianbay+"\n Tổng số ghế :"+tongsoghe+"\n Số ghế đã bán :"+ghedaban+"\n Số ghế còn trống :"+ghecontrong+"\n";
	}

	@Override
	public double muave(int sove, double giave) throws RemoteException {
		// trả về số tiền của giá vé * số vé mà người mua nhập
		return sove * giave;
	}

	@Override
	public double trave(int sove, double giave) throws RemoteException {
		// Vì là đã đặt vé cho nên khi trả lại vé khách hàng sẽ bị mất 50% số tiền đã mua.
		return (sove * giave)/2;
	}
		
}
