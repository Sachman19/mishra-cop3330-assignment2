package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static ex37.app.findLength;

class appTest {

    @Test
    void passwordTester() {
        assertEquals(10, findLength(8, 2, 3));
        assertEquals(5, findLength(5, 1, 1));
        assertEquals(16, findLength(16, 4, 2));
    }
}