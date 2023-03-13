package ch02.sec11;

public class VariableScopeEx {

	public static void main(String[] args) {
		// 변수 사용 범위
		int v1 = 15;
		if(v1>10) {
			int v2 = v1-10;
		} // int v3 = v1+v2+5; >> 중괄호 밖에선 v2를 사용할 수 없어서 컴파일 에러

	}

}
