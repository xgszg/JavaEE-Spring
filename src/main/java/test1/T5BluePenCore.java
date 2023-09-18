package test1;

public class T5BluePenCore extends T5PenCore{
    T5BluePenCore(){
        color = "蓝色";
    }
    public void writeWord(String s){
        System.out.println("写出" + color + "的字：" + s);
    }
}
