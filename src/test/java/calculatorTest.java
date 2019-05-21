import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;

public class calculatorTest {

    @Test
    public void addTest1() {
        assertEquals(true, Calculator.addition(2, 3));
        assertEquals(Integer.valueOf(5), Calculator.getResult());
    }

    @Test
    public void addTest2() {
        assertEquals(false, Calculator.addition(null, 1));
        assertEquals(null, Calculator.getResult());
    }

    @Test
    public void addTest3() {
        assertEquals(false, Calculator.addition(1, null));
        assertEquals(null, Calculator.getResult());
    }

    @Test
    public void subtractTest1() {
        assertEquals(true, Calculator.subtraction(3, 1));
        assertEquals(Integer.valueOf(2), Calculator.getResult());
    }

    @Test
    public void subtractTest2() {
        assertEquals(false, Calculator.subtraction(null, 1));
        assertEquals(null, Calculator.getResult());
    }

    @Test
    public void subtractTest3() {
        assertEquals(false, Calculator.subtraction(1, null));
        assertEquals(null, Calculator.getResult());
    }

    @Test
    public void mulTest1() {
        assertEquals(true, Calculator.multiplication(2, 3));
        assertEquals(Integer.valueOf(6), Calculator.getResult());
    }

    @Test
    public void mulTest2() {
        assertEquals(false, Calculator.multiplication(null, 1));
        assertEquals(null, Calculator.getResult());
    }

    @Test
    public void mulTest3() {
        assertEquals(false, Calculator.multiplication(1, null));
        assertEquals(null, Calculator.getResult());
    }

    @Test
    public void divTest1() {
        assertEquals(true, Calculator.division(4, 2));
        assertEquals(Integer.valueOf(2), Calculator.getResult());
    }

    @Test
    public void divTest2() {
        assertEquals(false, Calculator.division(null, 1));
        assertEquals(null, Calculator.getResult());
    }

    @Test
    public void divTest3() {
        assertEquals(false, Calculator.division(1, null));
        assertEquals(null, Calculator.getResult());
    }

    @Test
    public void divTest4() {
        assertEquals(false, Calculator.division(1, 0));
        assertEquals(null, Calculator.getResult());
    }

    @Test
    public void modTest1() {
        assertEquals(true, Calculator.modulus(4, 3));
        assertEquals(Integer.valueOf(1), Calculator.getResult());
    }

    @Test
    public void modTest2() {
        assertEquals(false, Calculator.modulus(null, 1));
        assertEquals(null, Calculator.getResult());
    }

    @Test
    public void modTest3() {
        assertEquals(false, Calculator.modulus(1, null));
        assertEquals(null, Calculator.getResult());
    }

    @Test
    public void modTest4() {
        assertEquals(false, Calculator.modulus(1, 0));
        assertEquals(null, Calculator.getResult());
    }

    @After
    public void reset() {
        Calculator.setResult(null);
    }
}
