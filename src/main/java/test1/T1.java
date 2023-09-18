package test1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class T1 {
    public static void main(String[] args) throws Exception {
        Class<?> personClass = Class.forName("test1.Person");
        Field[] fields = personClass.getDeclaredFields();
        System.out.println("类的属性如下:");
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Object person = personClass.getDeclaredConstructor().newInstance();

        // 设置属性的值
        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true); // 使私有属性可访问
        nameField.set(person, "小怪兽");

        // 获取属性的值
        String name = (String) nameField.get(person);
        System.out.println("name: " + name);

        // 调用方法
        Method sayHelloMethod = personClass.getDeclaredMethod("sayHello");
        sayHelloMethod.setAccessible(true); // 使私有方法可访问
        sayHelloMethod.invoke(person);
    }
}
//被反射类
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("你好，我的名字是：" + name);
    }
}
