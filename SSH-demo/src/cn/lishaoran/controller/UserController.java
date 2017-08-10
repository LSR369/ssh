package cn.lishaoran.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.lishaoran.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping(value="/manager",method=RequestMethod.GET)
	public ModelAndView hello2(){
		ModelAndView mv =new ModelAndView();
		mv.addObject("message", "HelloMVC");
		mv.setViewName("user");
		return mv;
	}
	
	@RequestMapping(value="/count",method=RequestMethod.GET)
	public ModelAndView count(){
		int c =userService.userCount();
		
		ModelAndView mv =new ModelAndView();
		mv.addObject("message", c);
		mv.setViewName("user");
		return mv;
	}
	
	
}
