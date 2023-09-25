package test2.T4.dao;
import org.springframework.stereotype.Repository;
import test2.T4.domain.Apple;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class AppleDaoImpl {
    public Apple generateApple() {
        Random random = new Random();
        float price = 3 + random.nextFloat() * (10 - 3);
        float weight = 100 + random.nextFloat() * (300 - 100);
        Apple apple = new Apple();
        apple.setPrice(price);
        apple.setWeight(weight);
        return apple;
    }

    public List<Apple> getApples(int count) {
        List<Apple> apples = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            apples.add(generateApple());
        }
        return apples;
    }
}