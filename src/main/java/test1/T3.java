package test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class T3 {
    public static void main(String[] args) {
        try {
            Class<?> personClass = Class.forName("test1.Person");
            // 获取构造函数
            Constructor<?> constructor = personClass.getDeclaredConstructor();
            Object personInstance = constructor.newInstance();
            // 获取setName方法
            Method setNameMethod = personClass.getMethod("setName", String.class);
            setNameMethod.invoke(personInstance, "小怪兽");

            // 获取sayHello方法
            Method sayHelloMethod = personClass.getMethod("sayHello");
            sayHelloMethod.invoke(personInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
