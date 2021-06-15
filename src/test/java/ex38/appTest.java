package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ex38.app.filterEvenNumbers;

class appTest {

    @Test
    void filterEvenNumbersTest() {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = {2, 4, 6, 8};

        assertArrayEquals(expected, filterEvenNumbers(original));
    }
}