package tw.edu.nuk.java2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
	
	@RequestMapping("/welcome/{member}")
	public String welcomeMember(Model model, 
			@PathVariable("member") String MemberName) {
		
		model.addAttribute("member", MemberName);
	
		
		return "WelcomeView";
	}
	
	@RequestMapping("/hello")
	public String helloUser(Model model, 
			@RequestParam(value="user", defaultValue="User") String UserName) {
		
		model.addAttribute("user", UserName);
		
		return "HelloView";
		
	}
	
	@RequestMapping("/news")
	public String doRedirect(@RequestParam(value="url", defaultValue="http://www.yahoo.com.tw") String url) {
		
		return "redirect:"+url;
	}

}
