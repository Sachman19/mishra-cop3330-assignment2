package ex30;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static ex30.app.numDigits;

class appTest {

    @Test
    void testCount(){
        assertEquals(2, numDigits(2, 5));
        assertEquals(1, numDigits(1, 1));
    }

}