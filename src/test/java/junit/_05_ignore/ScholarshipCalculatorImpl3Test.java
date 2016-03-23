package junit._05_ignore;

import junit._01_test_annotation.IScholarshipCalculator;
import junit._01_test_annotation.ScholarshipCalculatorImpl1;
import junit._03_exceptions_test.ScholarshipCalculatorImpl3;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScholarshipCalculatorImpl3Test {
    private ScholarshipCalculatorImpl3 scholarshipCalculator;

    @Ignore("this test is not ready yet")
    @Test
    public void scholarshipCalculate() throws Exception {
        IScholarshipCalculator scholarshipCalculator = new ScholarshipCalculatorImpl1();
        double basicScholarship = 10;
        double stepUpCoefficient = 1.1;
        double expected = basicScholarship * stepUpCoefficient;
        double actual = scholarshipCalculator.scholarshipCalculate(stepUpCoefficient);
        assertEquals(expected, actual, 0.01);
    }
}