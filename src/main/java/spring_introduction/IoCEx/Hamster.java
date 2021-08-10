package spring_introduction.IoCEx;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component("hamsterBean") можно не прописывать Component,тогда bean будет hamster, но прописывание - good tone
//Если class VaforiteSong bean будет vaforiteSong
//Если class SQLTest bean будет SQLTest
@Component("hamsterBean")
@Scope("prototype")
public class Hamster implements Pet {
    private String name;
    @Override
    public void say() {
        System.out.println("wt-wt");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
