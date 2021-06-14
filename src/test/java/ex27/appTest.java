package ex27;

import org.junit.jupiter.api.Test;
import static ex27.app.nameLength;
import static ex27.app.zipNum;
import static ex27.app.idCheck;
import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void inputTest() {
        assertAll( () -> assertEquals(2, nameLength("J")),
                () -> assertEquals(1, nameLength("")),
                () -> assertEquals(1, zipNum("ABCDE")),
                () -> assertEquals(1, idCheck("A12-1234"))
        );

        assertAll( () -> assertEquals(0, nameLength("John")),
                () -> assertEquals(0, nameLength("Johnson")),
                () -> assertEquals(0, zipNum("55555")),
                () -> assertEquals(0, idCheck("TK-1234"))
        );
    }


}