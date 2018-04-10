import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void divisorSum() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.divisorSum(6));
    }
}