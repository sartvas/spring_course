package spring_introduction.IoCEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicPlayer {
    private Music music;
    private String group;

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
