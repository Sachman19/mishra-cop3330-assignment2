package ex40;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

import static ex40.app.*;
class appTest {

    @Test
    void test() {
        InputStream original = System.in;
        String inputs = "Jac";
        InputStream in = new ByteArrayInputStream(inputs.getBytes());
        System.setIn(in);

        main(null);

        System.setIn(original);
    }
}