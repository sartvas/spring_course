package spring_introduction.IoCEx;


import org.springframework.stereotype.Component;

// @Component("hamsterBean") можно не прописывать Component,тогда bean будет hamster, но прописывание - good tone
//Если class VaforiteSong bean будет vaforiteSong
//Если class SQLTest bean будет SQLTest
@Component("hamsterBean")
public class Hamster implements Pet {
    @Override
    public void say() {
        System.out.println("wt-wt");
    }
}
