package ch02.sec06;

public class TextBlockEx {

	public static void main(String[] args) {
		String str = ""+
				"{\n"+
				"\t\"id\":\"winter\",\n"+
				"\t\"name\":\"传价捞\"\n"+
				"}";
		
/*		String str2 = """
			{
					"id":"winter",
					"name":"传价捞"
			}""";  java 14 滚傈何磐 */
		System.out.println(str);
	}

}
