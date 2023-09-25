package test2.T2.annotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test2.T2.annotation.controller.TestController;
import test2.T2.annotation.dao.TestDaoImpl;

public class TestAnnotation {
    public static void main(String[] args){
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(ConfigAnnotation.class);
        TestController tc = appCon.getBean(TestController.class);
        tc.save();
        TestDaoImpl td=appCon.getBean(TestDaoImpl.class);
        System.out.println(td);
        appCon.close();
    }
}
