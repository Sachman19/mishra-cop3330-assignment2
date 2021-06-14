package ex28;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

import static ex28.app.input;

class appTest {


    @Test
    void inputTest() {
        InputStream original = System.in;
        String inputString = "1" + System.lineSeparator() + "2" + System.lineSeparator() + "3" + System.lineSeparator() + "4" + System.lineSeparator() +  "5" + System.lineSeparator();
        byte[] inputs = inputString.getBytes();
        InputStream input = new ByteArrayInputStream(inputs);
        System.setIn(input);

        assertEquals(1, input());
        assertEquals(2, input());
        assertEquals(3, input());
        assertEquals(4, input());
        assertEquals(5, input());

        System.setIn(original);
    }

}