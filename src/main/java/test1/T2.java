package test1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T2 {
    public static void main(String[] args) {
        // 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("T2xml.xml");

        // 获取Order实例
        T2Order order = (T2Order) context.getBean("order");

        // 调用displayOrderDetails方法显示订单信息
        order.ShowInfo();
    }
}
