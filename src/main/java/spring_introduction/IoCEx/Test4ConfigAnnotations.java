package spring_introduction.IoCEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4ConfigAnnotations {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aplicationContext4.xml");

        Hamster hamster = context.getBean("hamster", Hamster.class);
        hamster.say();
        context.close();
    }
}
