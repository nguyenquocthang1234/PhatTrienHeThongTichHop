package ChuyenBay;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ChuyenBayClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		//Kết nối với cổng mà server đã tạo
		ChuyenBayService bayService=(ChuyenBayService)Naming.lookup("rmi://localhost:7777/MuaVeMayBayService");
		Scanner scan =new Scanner(System.in);
		System.out.println("Vui lòng chọn dịch vụ :\n1.xem thông tin.\n2.mua vé.\n3.Trả vé:\n");
		int x=scan.nextInt();
		switch(x)
		{
		case 1:
		{
			
			String xemthongtin1=bayService.information(123, " 3h ngày 11-11-2020", "LA", "LB", "1:10 phút", 100, 45, 55);
			System.out.println("\nmã 123\n"+xemthongtin1);
			
			String xemthongtin2=bayService.information(124, " 3h ngày 11-11-2020", "LA", "LB", "1:10 phút", 100, 24, 76);
			System.out.println("\nmã 124\n"+xemthongtin2);
			
		}
		case 2:
		{
			double tonggia=0;
			System.out.println("GIÁ VÉ :\n1.1sao :1000000\n2.2sao :2000000\n3.3sao :3000000\n4.4sao :4000000\n5.5sao :5000000\n");
			System.out.println("Mời Bạn Nhập vào số vé cần mua : ");	
			int nhapsove=scan.nextInt();
			System.out.println("Mời Bạn chọn giá vé :");
			int nhapgiave=scan.nextInt();
			if(nhapgiave==1000000)
			{
				tonggia=bayService.muave(nhapsove, 1000000);
			}
			else if(nhapgiave==2000000)
			{
				tonggia=bayService.muave(nhapsove, 2000000);
			}
			else if(nhapgiave==3000000)
			{
				tonggia=bayService.muave(nhapsove, 3000000);
			}
			else if(nhapgiave==4000000)
			{
				tonggia=bayService.muave(nhapsove, 4000000);
			}
			else if(nhapgiave==5000000)
			{
				tonggia=bayService.muave(nhapsove, 5000000);
			}
			else 
			{
				System.out.println("Bạn Nhập Sai");
			}
			System.out.println("Tổng Tiền Mua Vé:"+tonggia+" VNĐ");
		}
		case 3:
		{
			System.out.println("Mời Bạn Nhập vào số vé trả : ");	
			int nhapvetra=scan.nextInt();
			System.out.println("Mời Bạn chọn giá vé :");
			int nhapve=scan.nextInt();
			double tonggia=0;
			if(nhapve==1000000)
			{
				tonggia=bayService.trave(nhapvetra, 1000000);
			}
			else if(nhapve==2000000)
			{
				tonggia=bayService.trave(nhapvetra, 2000000);
			}
			else if(nhapve==3000000)
			{
				tonggia=bayService.trave(nhapvetra, 3000000);
			}
			else if(nhapve==4000000)
			{
				tonggia=bayService.trave(nhapvetra, 4000000);
			}
			else if(nhapve==5000000)
			{
				tonggia=bayService.trave(nhapvetra, 5000000);
			}
			else 
			{
				System.out.println("Bạn Nhập Sai");
			}
			System.out.println("Tổng Tiền Nhận Lại:"+tonggia +" VNĐ");
		}
		}
		
	}

}
