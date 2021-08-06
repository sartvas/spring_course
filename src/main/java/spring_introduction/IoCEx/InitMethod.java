package spring_introduction.IoCEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitMethod {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aplicationContext3.xml");
        Turtle turtle = context.getBean("myPet", Turtle.class);
        turtle.say();
        context.close();

    }
}
