package test2.T2.javaBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test2.T2.javaBean.controller.TestController;

public class TestConfig {
    public static void main(String[] args){
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(JavaConfig.class);
        TestController tc = appCon.getBean(TestController.class);
        tc.save();
        appCon.close();
    }
}
