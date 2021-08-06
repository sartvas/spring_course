package spring_introduction.IoCEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.SortedMap;

public class BeanScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aplicationContext2.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        dog.setName("Bobik");
        Dog dog2 = context.getBean("myPet", Dog.class);
        dog2.setName("Tobik");
        System.out.println(dog.getName() + "&" + dog2.getName());
        context.close();
    }
}
