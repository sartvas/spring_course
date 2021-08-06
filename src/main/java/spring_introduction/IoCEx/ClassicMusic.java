package spring_introduction.IoCEx;

public class ClassicMusic implements Music{

    @Override
    public void play() {
        System.out.println("Playing Classic");
    }
}
