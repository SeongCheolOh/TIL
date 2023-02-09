package javaMid10.toeic;


public class Toeic {
	private int num; // 획득 점수
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void result(int num) throws InsufficientException{
		if(num<0) {throw new InsufficientException("0점 미만 토익점수 나올 수 없습니다");
		}else if(0<=num && num<=990) {
			System.out.println(num + "점 입니다");
		}else {
			throw new InsufficientException("990점 초과 토익점수 나올 수 없습니다");
		}
			
	}

}
