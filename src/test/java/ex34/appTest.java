package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static ex34.app.removeName;

class appTest {

    @Test
    void removeNameTest() {
        String[] expected = {"Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] actual = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        assertArrayEquals(expected, removeName(actual, "John Smith"), "Arrays should be equal");
    }
}