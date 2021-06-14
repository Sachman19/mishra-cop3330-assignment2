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
        String inputs = "1\n2\n3\n4\n5";
        InputStream in = new ByteArrayInputStream(inputs.getBytes());
        System.setIn(in);


        assertEquals(1, input());

        System.setIn(original);
    }

}