package test1;

public class T5Main {
    public static void main(String args[]){
        T5PenCore penCore;
        T5BallPen ballPen = new T5BlueBallPen();
        penCore = ballPen.getPenCore();
        penCore.writeWord("您好，很高兴认识你");
        ballPen = new T5RedBallPen();
        penCore = ballPen.getPenCore();
        penCore.writeWord("你好吗");
        ballPen = new T5BlackBallPen();
        penCore = ballPen.getPenCore();
        penCore.writeWord("我也很高兴认识你");
    }
}
