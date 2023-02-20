package LIFO;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {
//			Coin coin = coinBox.pop(); �� ������ ��Ƽ� ����ϴ���
			System.out.println(coinBox.pop().getValue());
		}

		Stack<Car> parking = new Stack<Car>();
		parking.push(new Car("K5"));
		parking.push(new Car("Tico"));
		parking.push(new Car("Grandeur"));
		parking.push(new Car("Benz"));
		parking.push(new Car("Sonata"));
		
		while(!parking.isEmpty()) {//parking�� ������� ������
//			Car p = parking.pop();
			System.out.println(parking.pop().getCar());
		}
	}

}
