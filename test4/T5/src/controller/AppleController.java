package controller;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import entity.Apple;

@Controller
public class AppleController {
	Apple apple;
    public AppleController() {
    	Random random = new Random();
        float price = 3 + random.nextFloat() * (10 - 3);
        Apple apple = new Apple();
        apple.setApplePrice(price);
        apple.setAppleName("Æ»¹û1");
		this.apple = apple;
	}
	@RequestMapping("/appleRequest")
    public ModelAndView appleRequest() {
    	ModelAndView mv = new ModelAndView();
    	String applejson = getApple();
    	float appleprice = getApple2();
        mv.addObject("apple", this.apple);
        mv.addObject("applejson", applejson);
        mv.addObject("appleprice", appleprice);
    	mv.setViewName("applerequset");
    	return mv;
    }
    public String getApple() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			String json = objectMapper.writeValueAsString(this.apple);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
    public float getApple2() {
		return this.apple.getApplePrice();
    }
}