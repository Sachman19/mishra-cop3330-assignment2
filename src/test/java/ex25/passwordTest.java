package ex25;

import org.junit.jupiter.api.Test;
import static ex25.app.passwordValidator;

import static org.junit.jupiter.api.Assertions.*;

class passwordTest {

    @Test
    void passwordTester() {
        assertAll(
                () -> assertEquals(0, passwordValidator("12345")),
                () -> assertEquals(1, passwordValidator("abcdef")),
                () -> assertEquals(2, passwordValidator("abc123xyz")),
                () -> assertEquals(3, passwordValidator("1337h@xor!")));

    }

}