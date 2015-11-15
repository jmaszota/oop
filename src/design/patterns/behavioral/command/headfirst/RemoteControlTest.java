package design.patterns.behavioral.command.headfirst;

/**
 * Created by jacek.maszota on 16.08.2015.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl invoker = new SimpleRemoteControl();

        Light lightReciver = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReciver);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);

        invoker.setCommand(lightOnCommand);
        invoker.buttonWasPressed();

        invoker.setCommand(garageDoorUpCommand);
        invoker.buttonWasPressed();


        //--------------------------------------------------//

        RemoteControl remote = new RemoteControl();

        LightOffCommand lightOffCommand = new LightOffCommand(lightReciver);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
        Stereo stereo = new Stereo();

        StereoOnWithCommand stereoOnWithCommand = new StereoOnWithCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remote.setCommand(0,lightOnCommand, lightOffCommand);
        remote.setCommand(1, garageDoorUpCommand, garageDoorDownCommand);
        remote.setCommand(2, stereoOnWithCommand, stereoOffCommand);

        System.out.println(remote);

        remote.buttonOnPressed(0);
        remote.undoButtonPressed();
        remote.buttonOffPressed(0);
        remote.buttonOnPressed(1);
        remote.buttonOffPressed(1);
        remote.buttonOnPressed(2);
        remote.buttonOffPressed(2);

        //-----------------------------------//
        System.out.println("//----------------------SeilingFan------------------------");
        remote = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("Kitchen");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remote.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
        remote.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);

        remote.buttonOnPressed(1);
        System.out.println(ceilingFan.getSpeed());
        remote.buttonOnPressed(0);
        System.out.println(ceilingFan.getSpeed());
        remote.undoButtonPressed();
        System.out.println(ceilingFan.getSpeed());

        //----------------PARTY----------------------//
        System.out.println("\t\tPARTY");

        Command[] partyOn = {lightOnCommand, stereoOnWithCommand};
        Command[] partyOff = {lightOffCommand, stereoOffCommand};

        MacroCommand partyOnCommand = new MacroCommand(partyOn);
        MacroCommand partyOffCommand = new MacroCommand(partyOff);

        remote = new RemoteControl();
        remote.setCommand(0, partyOnCommand, partyOffCommand);
        remote.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        remote.buttonOnPressed(0);
        remote.undoButtonPressed();


    }
}
