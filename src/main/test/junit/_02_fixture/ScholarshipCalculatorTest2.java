package junit._02_fixture;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScholarshipCalculatorTest2 {
    private ScholarshipCalculatorImpl2 scholarshipCalculator;

    @Before
    public void setUp() throws Exception {
        scholarshipCalculator = new ScholarshipCalculatorImpl2();
    }

    @After
    public void tearDown() throws Exception {
        scholarshipCalculator = null;
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