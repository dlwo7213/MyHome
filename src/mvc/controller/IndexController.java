package mvc.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index.do")
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("==========|IndexController.execute()|==========");
		return "/index";
	}
}
