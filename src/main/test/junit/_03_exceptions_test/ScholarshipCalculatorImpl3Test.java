package junit._03_exceptions_test;

import junit._02_fixture.ScholarshipCalculatorImpl2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScholarshipCalculatorImpl3Test {
    private ScholarshipCalculatorImpl3 scholarshipCalculator;

    @Before
    public void setUp() throws Exception {
        scholarshipCalculator = new ScholarshipCalculatorImpl3();
    }

    @Test(expected = NoSuchMarkException.class)
    public void stepUpCoefficientCalculateTest1() throws NoSuchMarkException {
        double expected = 1;
        double actual = scholarshipCalculator.stepUpCoefficientCalculate(11);
        assertEquals("For mark 11 wasn't exception: ", expected, actual, 0.01);
    }

    @Test
    public void stepUpCoefficientCalculateTest2() {
        int averageMark = 11;
        try {
            scholarshipCalculator.stepUpCoefficientCalculate(averageMark);
            fail("Test for mark " + averageMark + " should have thrown a NotSuchMarkException");
        } catch (NoSuchMarkException e) {
            assertEquals("There is no mark: " + averageMark, e.getMessage());
        }
    }
}