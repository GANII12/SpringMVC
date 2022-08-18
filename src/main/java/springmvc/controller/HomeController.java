package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home", method= RequestMethod.GET)
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
	public ModelAndView help() {
		//creating object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name", "Swetha");
		
		//setting the view name
		modelAndView.setViewName("help");
		
		//setting time
		LocalDateTime date = LocalDateTime.now();
		modelAndView.addObject("time", date);
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(79);
		list.add(68);
		modelAndView.addObject("marks", list);
		
		return modelAndView;
	}
}
