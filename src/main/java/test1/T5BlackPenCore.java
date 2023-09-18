package test1;

public class T5BlackPenCore extends T5PenCore{
    T5BlackPenCore(){
        color = "蓝色";
    }
    public void writeWord(String s){
        System.out.println("写出" + color + "的字：" + s);
    }
}
