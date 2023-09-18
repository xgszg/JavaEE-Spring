package test1;

public class T2Student {
    private String name;

    public T2Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("学生姓名: " + name);
    }
}
