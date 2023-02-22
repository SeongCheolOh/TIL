package academy_example;

import java.util.ArrayList;
import java.util.List;

public class Ex230222_1 {

	public static void main(String[] args) {
		//100 이하의 양의 정수만 입력받아서 정수의 합 구하기 
		List<Ex230222_1class> list = new ArrayList<Ex230222_1class>();
		int sum = 0;
		for(int i = 1; i<=100; i++) {//100번의 반복문
			list.add(new Ex230222_1class(i-1));//인덱스는 0번부터라 i-1으로 작성
			list.get(i-1).setNum(i);//i-1인덱스의 값을 i로 setNum하여 보내고
			sum += list.get(i-1).getNum();//합산
		}System.out.println("인덱스의 갯수 = " + list.size()+"개");
		System.out.println(list.size()+"개의 인덱스 총 합은 "+sum+ "입니다");
		
	}//end main
		
}//end class
class Ex230222_1class{
	int num;

	public Ex230222_1class(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
