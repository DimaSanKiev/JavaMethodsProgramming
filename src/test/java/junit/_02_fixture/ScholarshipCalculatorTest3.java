package junit._02_fixture;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScholarshipCalculatorTest3 {
    private static ScholarshipCalculatorImpl2 scholarshipCalculator;

    @BeforeClass
    public static void initScholarshipCalculator() {    // static required
        scholarshipCalculator = new ScholarshipCalculatorImpl2();
    }

    @Test
    public void stepUpCoefficientForFiveTest() throws Exception {
        double expected = 1.5;
        double actual  = scholarshipCalculator.stepUpCoefficientCalculate(5);
        assertEquals("Coefficient for mark 5 is wrong: ", expected, actual, 0.01);
    }

    @Test
    public void stepUpCoefficientForThreeTest() throws Exception {
        double expected = 1;
        double actual  = scholarshipCalculator.stepUpCoefficientCalculate(3);
        assertEquals("Coefficient for mark 5 is wrong: ", expected, actual, 0.01);
    }
}