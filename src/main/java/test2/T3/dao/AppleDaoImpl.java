package test2.T3.dao;
import test2.T3.domain.Apple;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Repository;

@Repository
public class AppleDaoImpl {
    // 随机生成Apple对象
    public Apple generateApple() {
        Random random = new Random();
        float price = 3 + random.nextFloat() * (10 - 3);
        float weight = 100 + random.nextFloat() * (300 - 100);

        Apple apple = new Apple();
        apple.setPrice(price);
        apple.setWeight(weight);

        return apple;
    }

    // 获取苹果列表
    public List<Apple> getApples(int count) {
        List<Apple> apples = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Apple apple = generateApple();
            apples.add(apple);
        }
        return apples;
    }
}
