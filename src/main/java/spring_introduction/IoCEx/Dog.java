package spring_introduction.IoCEx;

public class Dog implements Pet{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say(){
    System.out.println("Bow-Bow");
}
}
