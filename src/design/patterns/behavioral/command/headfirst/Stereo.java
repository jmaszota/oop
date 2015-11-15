package design.patterns.behavioral.command.headfirst;

/**
 * Created by jacek.maszota on 25.08.2015.
 */
public class Stereo {

    private int volume;

    public void on(){
        System.out.println("Stereo ON");
    }

    public void off(){
        System.out.println("Stereo OFF");
    }

    public void setCD(){
        System.out.println("Set CD");
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
}
