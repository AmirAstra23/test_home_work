import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculateSimpleTest {

    @org.junit.jupiter.api.Test
    void sumTest() {
        var testSum = new CalculateSimple();
        Assertions.assertEquals(5, testSum.sum(2, 3));
    }

    @org.junit.jupiter.api.Test
    void divisionTest() {
        var testDivision = new CalculateSimple();
        Assertions.assertEquals(2, testDivision.division(6, 3));
        Assertions.assertEquals(Integer.MIN_VALUE,testDivision.division(10, 0));
    }

    @org.junit.jupiter.api.Test
    void multiplicationTest() {
        var testMultiplication = new CalculateSimple();
        Assertions.assertEquals(15, testMultiplication.multiplication(3, 5));
    }
}