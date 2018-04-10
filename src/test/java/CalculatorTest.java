import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void divisorSum() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.divisorSum(6));
        assertEquals(0, calculator.divisorSum(0));
        assertEquals(1, calculator.divisorSum(1));
        assertEquals(4, calculator.divisorSum(3));
    }
}