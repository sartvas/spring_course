package spring_introduction.IoCEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4ConfigAnnotations {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aplicationContext4.xml");

//        Hamster hamster = context.getBean("hamsterBean", Hamster.class);
//        hamster.say();

        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
