package sample.spring.prtc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;

	@RequestMapping(value="/join", method = RequestMethod.GET)
	// /join 요청하면 "member/join.jsp"뷰로 응답
	public ModelAndView join() {
	    return new ModelAndView("member/join");
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public ModelAndView createPost(@RequestParam Map<String, Object> map) {
	    ModelAndView mav = new ModelAndView();

	    String memberId = this.memberService.create(map);
	    if (memberId == null) {
	        mav.setViewName("redirect:/join");
	    }else {
	        mav.setViewName("redirect:/detail?memberId=" + memberId); 
	    }  

	    return mav;
	}
}
