package test2.T2.annotation.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import test2.T2.annotation.service.TestService;

@Controller
public class TestController {
    @Autowired
    private TestService testService;
    public void save(){
        testService.save();
        System.out.println("testController save");
    }
}
