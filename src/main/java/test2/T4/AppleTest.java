package test2.T4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test2.T4.controller.AppleController;

public class AppleTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigAnnotation.class);
        AppleController appleController = context.getBean(AppleController.class);
        appleController.printApples(5);
    }
}
