package test1;

public class T5RedPenCore extends T5PenCore {
    T5RedPenCore(){
        color = "红色";
    }
    public void writeWord(String s){
        System.out.println("写出" + color + "的字：" + s);
    }
}
