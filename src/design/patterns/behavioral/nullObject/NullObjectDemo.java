package design.patterns.behavioral.nullObject;

import java.io.PrintStream;

/**
 * Created by jacek.maszota on 25.07.2015.
 */
public class NullObjectDemo {
    public static void main(String[] args) {
        //LOG on based on config
        LogApplication log = new LogApplication(System.out);
        log.log();

        //LOG of based on config
        log = new LogApplication(new NullPrintStream());
        log.log();
    }
}
