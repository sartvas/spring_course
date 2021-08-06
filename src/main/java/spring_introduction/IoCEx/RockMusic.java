package spring_introduction.IoCEx;

public class RockMusic implements Music{
    private String group;

    public void play(){
        System.out.println("Playing Rock");

    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
