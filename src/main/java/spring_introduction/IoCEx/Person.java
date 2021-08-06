package spring_introduction.IoCEx;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person(){
        System.out.println("Person created");
    }

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
