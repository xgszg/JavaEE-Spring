package test1;
@T4MyAnnotation(value = "在T4Main中运行")
public class T4Main {
    public static void main(String[] args) {
        T4MyAnnotationProcessor.process(T4Main.class);
    }
}
