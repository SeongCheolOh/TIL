package javaBasic5.day01.ex18;
//싱글톤 모습으로 
// 1. private 값 객체생성 한 참조변수를 넣어라
// 2. 객체생성 private
// 3. getInstance() public return 참조변수
public class ShopService {
	
	//1
	private static ShopService s = new ShopService();
	
	//2
	private ShopService() {}
	
	//3
	public static ShopService getInstance() {
		return s;
	}
}
