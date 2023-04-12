package sample.spring.prtc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/board", method = RequestMethod.GET)
	// 요청 /board 응답 board/board1 쿠팡 게시판
	public ModelAndView board1() {
		return new ModelAndView("board/board1");
	}
	
	@RequestMapping(value="/board", method = RequestMethod.POST)
	// 요청 /board 응답 board/board1 쿠팡 게시판
	public ModelAndView createPost( @RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		
		String boardId = this.boardService.create(map);
		if(boardId == null) {
			mav.setViewName("redirect:/board");
		}
		else {
			mav.setViewName("redirect:/detail?boardId="+boardId);
		}
		return mav;
	}
}
