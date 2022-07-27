package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home url");
		model.addAttribute("name","Arun");
		model.addAttribute("id",1467);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Amol");
		friends.add("Ganesh");
		
		model.addAttribute("f", friends);
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/help")
	public String help() {
		return "help";
	}
}
