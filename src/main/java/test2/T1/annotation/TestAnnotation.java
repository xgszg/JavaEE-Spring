package test2.T1.annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestAnnotation {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("annotationContext.xml");
        AnnotationUser au = (AnnotationUser) appCon.getBean("annotationUser");
        System.out.println(au.getUname());
    }
}
