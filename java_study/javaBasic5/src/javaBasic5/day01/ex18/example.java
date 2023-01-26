package javaBasic5.day01.ex18;

public class example {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
	
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다"+ obj1 + " "+ obj2);
		}
		else {
			System.out.println("다른 ShopService 객체입니다");
		}
	}

}
