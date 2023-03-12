package javaCh17;

import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamEx04 {

	public static void main(String[] args) throws Exception {
		// p.733 파일로부터 스트림 얻기
		
		Path path = Paths.get(StreamEx04.class.getResource("data.txt").toURI());
		System.out.println(path);
		
		Stream<String> stream = Files.lines(path, Charset.forName("utf-8"));
							   stream.forEach(d-> System.out.println(d));
							   stream.close();
	}

}
