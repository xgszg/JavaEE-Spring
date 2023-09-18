package test1;
import java.lang.annotation.Annotation;

public class T4MyAnnotationProcessor {
    public static void process(Class<?> clazz) {
        Annotation[] annotations = clazz.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof T4MyAnnotation) {
                T4MyAnnotation t4myAnnotation = (T4MyAnnotation) annotation;
                System.out.println("类名为: " + t4myAnnotation.value());
            }
        }
    }
}
