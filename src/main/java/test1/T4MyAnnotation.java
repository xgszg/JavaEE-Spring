package test1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // 仅可用于类
@Retention(RetentionPolicy.RUNTIME)
public @interface T4MyAnnotation {
    String value() default "T4MyAnnotation";
}