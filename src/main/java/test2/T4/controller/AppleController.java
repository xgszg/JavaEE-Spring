package test2.T4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import test2.T4.service.AppleServiceImpl;

@Controller
public class AppleController {
    @Autowired
    private AppleServiceImpl appleService;
    public void printApples(int count) {
        String json = appleService.getApplesAsJson(count);
        System.out.println(json);
    }
}