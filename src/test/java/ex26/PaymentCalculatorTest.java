package ex26;

import org.junit.jupiter.api.Test;
import static ex26.PaymentCalculator.calculateMonthsUntilPaidOff;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calcTest() {
        assertEquals(70, calculateMonthsUntilPaidOff(5000, 12, 100));
    }
}