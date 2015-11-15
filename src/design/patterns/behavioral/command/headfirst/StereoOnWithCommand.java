package design.patterns.behavioral.command.headfirst;

/**
 * Created by jacek.maszota on 25.08.2015.
 */
public class StereoOnWithCommand implements Command {

    Stereo stereo;

    public StereoOnWithCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
