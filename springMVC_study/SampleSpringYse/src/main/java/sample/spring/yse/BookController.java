package sample.spring.yse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller // 아래 있는 클래스 BookCOntroller은 컨트롤러 역할을 한다.
public class BookController {
	
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public ModelAndView create() {
	    return new ModelAndView("book/create");
	}
	
	@RequestMapping(value="/test1", method = RequestMethod.GET)
	public ModelAndView test1() {
	    return new ModelAndView("book/test1");
	}
}
