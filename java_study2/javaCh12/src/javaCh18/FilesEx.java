package javaCh18;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesEx {

	public static void main(String[] args) throws IOException {
		String data = "id: winter\n email: winter@myCompany.com/\n tel:010-123-1234";
		
		Path path = Paths.get("C:\\webStudyB\\temp/user.txt");
		
		Files.writeString(Paths.get("C:\\webStudyB\\temp/user.txt"), data, Charset.forName("utf-8"));
		
		System.out.println("파일 유형 : " + Files.probeContentType(path));
		System.out.println("파일 크기 : " + Files.size(path)+ "bytes");
		
		String content = Files.readString(path, Charset.forName("utf-8"));
		System.out.println(content);
	}

}
