package javaCh13;

public class GenericEx02 {

	public static void main(String[] args) {
		// 
		
		Product<Tv,String> product1 = new Product<Tv,String>();
		product1.setKind(new Tv());
		Tv tv1 = product1.getKind();
		System.out.println(tv1);
		
		product1.setModel("스마트TV");
		System.out.println(product1.getModel());
		
		//Tv = K , 5000000 = M
		//Tv값이 500만원 이상이면 "차라리 자동차를 구매하세요"
		Product<Tv,Integer> product2 = new Product<Tv, Integer>();
		product2.setKind(new Tv());
		product2.setModel(5000000);
		System.out.println(product2.getKind());
		if( product2.getKind().toString().equals("TV") && 5000000<=product2.getModel()) {
			System.out.println("차라리 자동차를 구매하세요");
		}
		
		//K=10,000,000이상이면 "난 조금 더 돈을 모아서 M자동차를 살거야
		Product<Integer,Car> product3 = new Product<Integer, Car>();
		product3.setKind(10000000);
		product3.setModel(new Car());
		System.out.println(product3.getModel().toString().equals("CAR"));
		if(product3.getKind()>=10000000) {
			System.out.println("난 조금 더 돈을 모아서 "+ product3.getModel()+"를 살거야");
		}


	}

}

class Product<K,M>{
	private K kind;
	private M model;
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
		
}

class Tv{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "TV";
	}
	
}

class Car{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CAR";
	}
}