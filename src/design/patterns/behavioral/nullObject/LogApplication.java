package design.patterns.behavioral.nullObject;

import java.io.PrintStream;

/**
 * Created by jacek.maszota on 25.07.2015.
 */
public class LogApplication {
    private PrintStream debugout;

    public LogApplication(PrintStream debugout) {
        this.debugout = debugout;
    }

    public void log() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            debugout.println("i = " + i);
        }
        System.out.println("sum = " + sum);
    }
}
