package spring_introduction.IoCEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4ConfigAnnotations {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aplicationContext4.xml");

        Hamster hamster = context.getBean("hamsterBean", Hamster.class);
        Hamster myHamster = context.getBean("hamsterBean", Hamster.class);
        hamster.setName("Nysha");
        myHamster.setName("Busya");

        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        System.out.println("We have two hamsters :"+hamster.getName()+" and "+myHamster.getName());

        context.close();
    }
}
