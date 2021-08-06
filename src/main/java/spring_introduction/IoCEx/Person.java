package spring_introduction.IoCEx;

public class Person {
    Pet pet;

    public Person(){
        System.out.println("Person created");
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Come here, bitch!");
        pet.say();
    }
}
