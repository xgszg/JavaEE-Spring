package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping("/login")
	public String login(HttpSession session, HttpServletRequest request) {
		session.setAttribute("skey", "xgs");
		request.setAttribute("rkey", "xgs");
		return "login";// 跳转到/WEB-INF/jsp/login.jsp
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}
}
