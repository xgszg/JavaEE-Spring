package test1;

public class T2Order {
    private T2Student student;
    private String productName;

    public T2Order(T2Student student, String productName) {
        this.student = student;
        this.productName = productName;
    }

    public void ShowInfo() {
        System.out.println("下单学生名字: " + student.getName());
        System.out.println("物品名称: " + productName);
    }
}
