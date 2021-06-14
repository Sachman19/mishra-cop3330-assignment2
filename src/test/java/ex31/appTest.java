package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static ex31.app.calcBPM;

class appTest {

    @Test
    void BPMcalc() {
        assertAll(() -> assertEquals(138, calcBPM(65, 22, .55)),
                () -> assertEquals(145, calcBPM(65, 22, .60)),
                () -> assertEquals(151, calcBPM(65, 22, .65)),
                () -> assertEquals(178, calcBPM(65, 22, .85)),
                () -> assertEquals(185, calcBPM(65, 22, .90)),
                () -> assertEquals(191, calcBPM(65, 22, .95))
                );

    }
}