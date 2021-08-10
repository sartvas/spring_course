package spring_introduction.IoCEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("hamsterBean")
    private Pet pet;
//    @Value("Artem") лучше не харкодить Value, а юзать properties
    @Value("${person.surname}")
    private String surname;
//    @Value("35")
    @Value("${person.age}")
    private int age;


//    @Autowired
//    public Person(Pet pet){
//        System.out.println("Person is created");
//        this.pet = pet;
//    }


    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callPet(){
        System.out.println("Come here, bitch!");
        pet.say();
    }
}
