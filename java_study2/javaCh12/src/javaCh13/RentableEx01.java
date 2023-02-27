package javaCh13;

public class RentableEx01 {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLite();
		
		BicycleAgency bicycleAgency = new BicycleAgency();
		Bicycle b1 = bicycleAgency.rent();
		b1.run();
		

	}

}

interface Rentable<P>{
	P rent();
	
}

class Home{
	void turnOnLite() {
		System.out.println("������ �մϴ�.");
	}
}

class Bicycle{
	void run() {
		System.out.println("�����Ű� �޸��ϴ�.");
	}
}

class HomeAgency implements Rentable<Home>{
	@Override
	public Home rent() {
		// TODO Auto-generated method stub
		return null;
	}
}

class BicycleAgency implements Rentable<Bicycle>{
	@Override
	public Bicycle rent() {
		// TODO Auto-generated method stub
		return null;
	}
}