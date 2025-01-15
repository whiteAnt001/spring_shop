package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoticeController {
	
	@RequestMapping(value="/notice/list.html")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("BODY", "noticeList.jsp");
		return mav;
	}
}
