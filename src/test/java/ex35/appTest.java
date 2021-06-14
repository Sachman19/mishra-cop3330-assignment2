package ex35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static ex35.app.pickAWinner;

class appTest {

    @Test
    void WinnerTest() {
        assertTrue(pickAWinner(5) >= 0 && pickAWinner(5) < 5);
        assertTrue(pickAWinner(5) >= 0 && pickAWinner(5) < 5);
        assertTrue(pickAWinner(5) >= 0 && pickAWinner(5) < 5);
    }
}