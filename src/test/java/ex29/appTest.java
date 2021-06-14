package ex29;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


import static ex29.app.NumCheck;
import static org.junit.jupiter.api.Assertions.assertEquals;

class appTest {

    @Test
    void Checknum() {
        InputStream original = System.in;
        String inputs = "1\n";
        InputStream in = new ByteArrayInputStream(inputs.getBytes());
        System.setIn(in);
        assertEquals(1, NumCheck());

        System.setIn(original);
    }
}