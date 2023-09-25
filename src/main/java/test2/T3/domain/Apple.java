package test2.T3.domain;

public class Apple {
    private float price;
    private float weight;

    public Apple(float price, float weight) {
        this.price = price;
        this.weight = weight;
    }

    public Apple() {

    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}