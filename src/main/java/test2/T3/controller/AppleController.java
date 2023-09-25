package test2.T3.controller;
import test2.T3.service.AppleServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class AppleController {
    private AppleServiceImpl appleService;

    // 构造函数
    public AppleController(AppleServiceImpl appleService) {
        this.appleService = appleService;
    }

    // 输出苹果列表的JSON串到控制台
    public void printApples(int count) {
        String json = appleService.getApplesAsJson(count);
        System.out.println(json);
    }
}