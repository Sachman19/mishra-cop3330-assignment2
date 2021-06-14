package ex32;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static ex32.app.findRange;

class appTest {
    @Test
    void testRange(){
        assertEquals(10, findRange(1));
        assertEquals(100, findRange(2));
        assertEquals(1000, findRange(3));
    }
}