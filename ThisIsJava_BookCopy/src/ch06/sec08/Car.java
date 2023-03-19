package ch06.sec08;

public class Car {
	//return 문은
	//메소드의 실행을 강제종료하고 호출한 곳으로 돌아간다 라는 의미
	//리턴 타입이 있을 경우에는 return 문 뒤에 리턴값을 추가로 지정해야 한다
	
	int gas;
	
	//리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}else {
			System.out.println("gas가 남았습니다");
			return true;
		}
		
	}
	
	//리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드를 종료
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("가스가 "+gas+"만큼 남았습니다");
				gas -= 1;
			}else {
				System.out.println("가스가 "+gas+"만큼 남았습니다");
				return;
			}
		}
	}
}
