package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import static ex36.app.average;
import static ex36.app.max;
import static ex36.app.min;
import static ex36.app.std;

class appTest {

    @Test
    void mathTest() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        assertEquals(400.0, average(numbers));
        assertEquals(1000, max(numbers));
        assertEquals(100, min(numbers));
        assertEquals(353.55, std(numbers));
    }
}