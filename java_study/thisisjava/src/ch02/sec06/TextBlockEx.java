package ch02.sec06;

public class TextBlockEx {

	public static void main(String[] args) {
		String str = ""+
				"{\n"+
				"\t\"id\":\"winter\",\n"+
				"\t\"name\":\"������\"\n"+
				"}";
		
/*		String str2 = """
			{
					"id":"winter",
					"name":"������"
			}""";  java 14 �������� */
		System.out.println(str);
	}

}
