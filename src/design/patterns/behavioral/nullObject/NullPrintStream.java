package design.patterns.behavioral.nullObject;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by jacek.maszota on 25.07.2015.
 */
public class NullPrintStream extends PrintStream {
    public NullPrintStream() {
        super(new NullOutputStream());
    }
}
