package answer;

import java.util.Scanner;

public class SaleBusiness {
	Scanner sc;
	Seoul sj;
	Kw kwj;
	Ki kij;
	Jeju jj;
	
	public SaleBusiness() {
		sc= new Scanner(System.in);
		sj = new Seoul();
		kwj = new Kw();
		kij = new Ki();
		jj = new Jeju();
	}
	
	public void input() {
		//입력메소드
		String yn = "n";
		do {
			System.out.println("지사는? ");
			System.out.println("1.서울지사 2.경인지사 3.강원지사 4.제주지사");
			System.out.print("번호를 입력하여주십시오. >");
			int jisaSelect;
			jisaSelect = sc.nextInt();
			switch(jisaSelect) {
				case 1: jisaInput(sj); break;
				case 2: jisaInput(kij); break;
				case 3: jisaInput(kwj); break;
				case 4: jisaInput(jj); break;
			}
			System.out.print("추가로 입력하시겠습니까? (y/n)");
			yn = sc.next();
			sc.nextLine();
			
		}while(yn.equalsIgnoreCase("y"));
	}

	private void jisaInput(Jisa js) {
		System.out.print("제품은 ? >");
		
		if(js instanceof Seoul) {//??
			sj = (Seoul)js;
			sj.setProName(sc.next());
			sc.nextLine();
			System.out.print(sj+"의 "+sj.getProName() + " 판매량은? ");
			sj.setSaleAmount(sc.nextInt());
			sj.setSaleStatus(saleStatusMethod(sj.getProName(),sj.getSaleAmount()));
			sj.setProPrice(proPriceInput(sj.getProName()));
//			System.out.println(sj.getProName()+" "+sj.getSaleAmount()+" "+sj.getSaleStatus());
		}
		if(js instanceof Ki) {//??
			kij = (Ki)js;
			kij.setProName(sc.next());
			sc.nextLine();
			System.out.print(kij+"의 "+kij.getProName() + " 판매량은? ");
			kij.setSaleAmount(sc.nextInt());
			kij.setSaleStatus(saleStatusMethod(kij.getProName(),kij.getSaleAmount()));
			kij.setProPrice(proPriceInput(kij.getProName()));

		}
		if(js instanceof Kw) {//??
			kwj = (Kw)js;
			kwj.setProName(sc.next());
			sc.nextLine();
			System.out.print(kwj+"의 "+kwj.getProName() + " 판매량은? ");
			kwj.setSaleAmount(sc.nextInt());
			kwj.setSaleStatus(saleStatusMethod(kwj.getProName(),kwj.getSaleAmount()));
			kwj.setProPrice(proPriceInput(kwj.getProName()));

		}
		if(js instanceof Jeju) {//??
			jj = (Jeju)js;
			jj.setProName(sc.next());
			sc.nextLine();
			System.out.print(jj+"의 "+jj.getProName() + " 판매량은? ");
			jj.setSaleAmount(sc.nextInt());
			jj.setSaleStatus(saleStatusMethod(jj.getProName(),jj.getSaleAmount()));
			jj.setProPrice(proPriceInput(jj.getProName()));

		}
	}
	
	public void output() {
		//출력메소드
		System.out.println("--------------------------------");
		System.out.println("--------각 지사 별 판매 현황---------");
		System.out.println("--------------------------------");
		System.out.printf("%12s %10s %10s %10s %10s\n", "지사명", "제품명", "제품가격", "판매량", "매출현황");
		System.out.printf("%12s %10s %10s %10s %10s\n", sj, sj.getProName(), sj.getProPrice(), sj.getSaleAmount(), sj.getSaleStatus());
		System.out.printf("%12s %10s %10s %10s %10s\n", kij, kij.getProName(), kij.getProPrice(), kij.getSaleAmount(), kij.getSaleStatus());
		System.out.printf("%12s %10s %10s %10s %10s\n", kwj, kwj.getProName(), kwj.getProPrice(), kwj.getSaleAmount(), kwj.getSaleStatus());
		System.out.printf("%12s %10s %10s %10s %10s\n", jj, jj.getProName(), jj.getProPrice(), jj.getSaleAmount(), jj.getSaleStatus());
	}

	private int saleStatusMethod(String proName, int amount) {
		//매출현황메소드
		int saleStatus= 0;//매출현황
		if(proName.equals("컴퓨터")) {
			saleStatus = 2000000* amount;
		}else if(proName.equals("프린터"))
			saleStatus = 500000* amount;
		else {
			System.out.println("제품을 잘못 입력하였습니다.");
		}
		return saleStatus;
	}
	
	private int proPriceInput(String proName) {
		if(proName.equals("컴퓨터"))return 2000000;
		else if(proName.equals("프린터")) return 500000;
		else return 0;
	}
}
