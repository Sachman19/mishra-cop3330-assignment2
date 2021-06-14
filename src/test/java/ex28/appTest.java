package ex28;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static ex28.app.add;
import static org.junit.jupiter.api.Assertions.*;

import static ex28.app.input;

class appTest {



    @Test
    void inputTest() {
        InputStream original = System.in;
        String inputs = "1\n";
        InputStream in = new ByteArrayInputStream(inputs.getBytes());
        System.setIn(in);
        assertEquals(1, input());

        inputs = "2\n";
        in = new ByteArrayInputStream(inputs.getBytes());
        System.setIn(in);
        assertEquals(2, input());

        inputs = "3\n";
        in = new ByteArrayInputStream(inputs.getBytes());
        System.setIn(in);
        assertEquals(3, input());

        inputs = "4\n";
        in = new ByteArrayInputStream(inputs.getBytes());
        System.setIn(in);
        assertEquals(4, input());

        inputs = "5\n";
        in = new ByteArrayInputStream(inputs.getBytes());
        System.setIn(in);
        assertEquals(5, input());

        assertEquals(15, add(1, 2, 3, 4, 5));

        System.setIn(original);
    }

}