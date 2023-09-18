package test1;

public abstract class T5BallPen {
    T5BallPen(){
        System.out.println("生产了一只装有" + getPenCore().color + "笔芯的圆珠笔");
    }
    public abstract T5PenCore getPenCore();
}
