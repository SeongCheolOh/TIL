package ch02.sec09;

public class StringConcatEx {

	public static void main(String[] args) {
		// ���ڿ� ������ ���տ���
		// �տ������� ����Ѵ�
		String result1 = 10+2+"8"; //(10+2)+"8"
		String result2 = 10+"2"+8; //(10+"2")+8
		String result3 = "10"+2+8; //("10"+2)+8
		String result4 = "10"+(2+8); //("10")+(2+8)
		System.out.println(result1+" "+result2+" "+result3+" "+result4);
	}

}
