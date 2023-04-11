package sample.spring.prtc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	
	@RequestMapping(value="/board", method = RequestMethod.GET)
	// 요청 /board 응답 board/board1 쿠팡 게시판
	public ModelAndView board() {
		return new ModelAndView("board/board1");
	}
}
