package controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import domain.Apple;
import service.AppleServiceImpl;

@Controller
public class AppleController {
    @Autowired
    private AppleServiceImpl appleService;
    @RequestMapping("/printApple")    
    public ModelAndView printApple() {
    	ModelAndView mv = new ModelAndView();
    	int count = 5;
        List<Apple> apples = appleService.getApples(count);
        mv.addObject("apples", apples);
    	mv.setViewName("look");
    	return mv;
    }
}