package sample.spring.yse;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller  
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping(value="/cinsert", method=RequestMethod.GET)
	public ModelAndView create() {
		return new ModelAndView("book/create");
	}

	@RequestMapping(value = "/cinsert", method = RequestMethod.POST)
	public ModelAndView createPost( @RequestParam Map<String, Object> map  ) {
		ModelAndView mav = new ModelAndView();
		
		String bookId = this.bookService.create(map);
		if(bookId==null) {
			mav.setViewName("redirect:/create"); // 재요청하기 /create 라고 
		} else {
			System.out.println( "삽입 성공");
			mav.setViewName("redirect:/detail?bookId=" + bookId);
		}
		return mav;
	}
	
	@RequestMapping(value="/detail", method=RequestMethod.GET )
	public ModelAndView  detail( @RequestParam  Map<String, Object>  map ) {
		
		Map<String, Object> detailMap = this.bookService.detail(map);
		System.out.println( detailMap + "~~");
		ModelAndView mav = new ModelAndView();
		if(detailMap == null ) {
			mav.setViewName("/book/error");
		}	
		else {
		mav.addObject("data", detailMap); //뷰로 detailMap의 값(데이터베이스에서 받은 ResultSet)을 data 속성에 담아서 보내라
	    String bookId = map.get("bookId").toString();
	    mav.addObject("bookId", bookId);
	    
	    //http://localhost:8085/yse/detail?bookId=5&bookQr=50&bookPublisher=한빛
//	    String bookQr = map.get("bookQr").toString();
//	    mav.addObject( "bookQrAName" , bookQr );//  bookQr값을 받아서 뷰의 bookQrAName 속성값으로 보내라
//	    String bookPub=map.get("bookPublisher").toString();
//	    mav.addObject("bookPubAName", bookPub);
	    
//	   // http://localhost:8085/yse/detail?bookId=5&a=2000&b=true&c=이젠
//       String a = map.get("a").toString();
//       mav.addObject("aAN", a);
//       String b = map.get("b").toString();
//       mav.addObject("bAN", b);
//       String c = map.get("c").toString();
//       mav.addObject("cAN", c);
       
       
	    
	    
	    mav.setViewName("/book/detail"); // src/main/webapp/web-inf/views/book/detail.jsp파일로 응답해라
		}
	    return mav;
	}
	
	
}
