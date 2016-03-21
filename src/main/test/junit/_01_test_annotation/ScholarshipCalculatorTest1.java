package junit._01_test_annotation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScholarshipCalculatorTest1 {

    @Test
    public void scholarshipCalculate() throws Exception {
        IScholarshipCalculator scholarshipCalculator = new ScholarshipCalculatorImpl1();
        double basicScholarship = ScholarshipCalculatorImpl1.BASIC_SCHOLARSHIP;
        double stepUpCoefficient = 1.1;
        double expected = basicScholarship * stepUpCoefficient;
        double actual = scholarshipCalculator.scholarshipCalculate(stepUpCoefficient);
        // match check with inaccuracy 0.01
        assertEquals(expected, actual, 0.01);
    }
}