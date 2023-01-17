package javaBasic2.ch05.day04;

public class ArrayEx02 {

	public static void main(String[] args) {
	/*	Banchan b1 = new Banchan();
		Banchan b2 = new Banchan();
		Banchan b3 = new Banchan();

		Banchan[] banArr = {b1,b2,b3}; */
		
		Banchan[] banArr = {new Banchan(),new Banchan(),new Banchan()}; // 위와 같은 내용
		
		System.out.println(banArr[0]);
		System.out.println(banArr[1]);
		System.out.println(banArr[2]);
		
		//0렬 주소에 조림류, 10, 5 입력해보기
		banArr[0].setKind("조림류");
		banArr[0].setMakeFood(10);
		banArr[0].setSaleFood(5);

		System.out.println(banArr[0].kind);
		System.out.println(banArr[0].makeFood);
		System.out.println(banArr[0].saleFood);
		
		//[1]주소에 국류 7 3
		banArr[1].setKind("국류");
		banArr[1].setMakeFood(7);
		banArr[1].setSaleFood(3);
		
		//[2]주소에 샐러드류 15 13
		banArr[2].setKind("샐러드류");
		banArr[2].setMakeFood(15);
		banArr[2].setSaleFood(13);
		
		//문) 클래스는 Hospital 병원 클래스를 만들고
		//필드는 진료과목(medical department) - 치과, 내과, 정형외과, 통증의학과
		//의사명(doctor name) - 김수영, 최진민, 박명호, 정경미
		//진료일(treatment day) - "20230117", "20230116",20230112", "20230110"
		//출력
		//진료과목 의사명 진료일
		// 치과 김수영 20230117
		// 내과 최진민 20230116
		// 정형외과 박명호 20230112
		// 통증의학과 정경미 20230110

	/*	Hospital a = new Hospital();
		Hospital b = new Hospital();
		Hospital c = new Hospital();
		Hospital[]Arr= {a,b,c}; */
		
		Hospital[]Arr = {new Hospital(),new Hospital(),new Hospital(),new Hospital()};
		Arr[0].setPart("치과");
		Arr[0].setName("김수영");
		Arr[0].setDay("20230117");
		Arr[1].setPart("내과");
		Arr[1].setName("최진민");
		Arr[1].setDay("20230116");
		Arr[2].setPart("정형외과");
		Arr[2].setName("박명호");
		Arr[2].setDay("20230112");
		Arr[3].setPart("통증의학과");
		Arr[3].setName("정경미");
		Arr[3].setDay("20230110");
		
		System.out.println("--------------------------");
		System.out.println("진료과목   의사명   진료일");
		System.out.println("--------------------------");
		for(int i=0; i<Arr.length ; i++) {
			System.out.println(Arr[i].part + Arr[i].name + Arr[i].day );
		}
		
		for( Hospital h : Arr) {
			System.out.println(h.getPart() + h.getName() + h.getDay());
		}
	/*	System.out.println(Arr[0].part + "    "+ Arr[0].name + "    "+ Arr[0].day);
		System.out.println(Arr[1].part + "    "+ Arr[1].name + "    "+ Arr[1].day);
		System.out.println(Arr[2].part + "    "+ Arr[2].name + "    "+ Arr[2].day);
		System.out.println(Arr[3].part + "    "+ Arr[3].name + "    "+ Arr[3].day); */
		
		
		
		
		
	}//end main

}//end class

class Banchan{
	String kind;
	int makeFood;
	int saleFood;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getMakeFood() {
		return makeFood;
	}
	public void setMakeFood(int makeFood) {
		this.makeFood = makeFood;
	}
	public int getSaleFood() {
		return saleFood;
	}
	public void setSaleFood(int saleFood) {
		this.saleFood = saleFood;
	}
	
}

class Hospital{
	String part;
	String name;
	String day;
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
}