package javaCh12.ex08;

import java.lang.reflect.Method;

public class PrintAnnotationEx {
	
	public static void main(String[] args) {
	
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			System.out.println(method);
			PrintAnnotation prtAn = method.getAnnotation(PrintAnnotation.class);
		
			printLine(prtAn);
			
		}
	
	}
	private static void printLine(PrintAnnotation prtAn ) {
		if(prtAn != null) {
			//num의 속성값 얻기
			int num = prtAn.number();
			for(int i = 0; i<num; i++) {
				//value값 얻기
				String value = prtAn.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}

}
