package test2.T3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test2.T3.controller.AppleController;

public class AppleTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AppleController appleController = context.getBean("appleController", AppleController.class);
        appleController.printApples(5); // 5表示要生成5个苹果
    }
}