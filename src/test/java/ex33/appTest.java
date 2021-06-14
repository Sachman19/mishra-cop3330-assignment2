package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static ex33.app.rng;

class appTest {

    @Test
    void rngTest() {
        assertTrue(rng() >= 0 && rng() < 4);
        assertTrue(rng() >= 0 && rng() < 4);
        assertTrue(rng() >= 0 && rng() < 4);
        assertTrue(rng() >= 0 && rng() < 4);
        assertTrue(rng() >= 0 && rng() < 4);
    }
}