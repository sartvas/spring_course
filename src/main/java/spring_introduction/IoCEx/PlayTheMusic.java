package spring_introduction.IoCEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayTheMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aplicationContext.xml");
        Music musicPlayer = context.getBean("myMusic", Music.class);
        musicPlayer.play();
    }
}
