package junit._04_timeout;

import junit._03_exceptions_test.ScholarshipCalculatorImpl3;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScholarshipCalculatorTestTime {
    private static ScholarshipCalculatorImpl3 scholarshipCalculator;

    @BeforeClass
    public static void initScholarshipCalculator() {    // static required
        scholarshipCalculator = new ScholarshipCalculatorImpl3();
    }

    @Test(timeout = 10)     // change to 20 for success pass
    public void scholarshipCalculatorTest() {
        for (int i = 1; i < 100_000; i++) {
            double stepUpCoefficient = 1 / i;
            double expected = 100 * stepUpCoefficient;
            double actual = scholarshipCalculator.scholarshipCalculate(stepUpCoefficient);
            assertEquals(expected, actual, 0.01);
        }
    }
}
