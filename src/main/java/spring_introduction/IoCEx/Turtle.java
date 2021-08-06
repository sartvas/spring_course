package spring_introduction.IoCEx;

public class Turtle implements Pet{
    public void say(){
        System.out.println("skr-skr");
    }
    public void init(){
        System.out.println("Turtle`s init method");
    }
    public void destroy(){
        System.out.println("Turtle`s destroy method");
    }
}
