package spring_introduction.IoCEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aplicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("myPerson", Person.class);
        person.callPet();

        System.out.println("person Age is: " + person.getAge());
        System.out.println("person Surname is: " + person.getSurname());

        context.close();
    }
}
