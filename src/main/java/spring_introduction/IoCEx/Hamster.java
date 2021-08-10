package spring_introduction.IoCEx;


import org.springframework.stereotype.Component;

// @Component("hamsterBean") можно не прописывать Component,тогда bean будет hamster
//Если class VaforiteSong bean будет vaforiteSong
//Если class SQLTest bean будет SQLTest
public class Hamster implements Pet {
    @Override
    public void say() {
        System.out.println("wt-wt");
    }
}
