package spring_introduction.IoCEx;

import org.springframework.stereotype.Component;

@Component("dogBean")
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
