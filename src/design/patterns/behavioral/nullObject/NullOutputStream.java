package design.patterns.behavioral.nullObject;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by jacek.maszota on 25.07.2015.
 */
public class NullOutputStream extends OutputStream {
    @Override
    public void write(int b) throws IOException {
        //do nothing
    }
}
