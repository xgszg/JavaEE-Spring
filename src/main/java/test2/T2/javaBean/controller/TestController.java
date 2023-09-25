package test2.T2.javaBean.controller;
import test2.T2.javaBean.Service.TestService;

public class TestController {
    private TestService testService;

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public void save(){
        testService.save();
        System.out.println("testController save");
    }
}
