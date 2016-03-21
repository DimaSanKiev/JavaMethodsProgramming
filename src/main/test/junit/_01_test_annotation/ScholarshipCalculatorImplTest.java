package junit._01_test_annotation;

import junit._01_test_annotation.IScholarshipCalculator;
import junit._01_test_annotation.ScholarshipCalculatorImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScholarshipCalculatorImplTest {

    @Test
    public void scholarshipCalculate() throws Exception {
        IScholarshipCalculator scholarshipCalculator = new ScholarshipCalculatorImpl();
        double basicScholarship = ScholarshipCalculatorImpl.BASIC_SCHOLARSHIP;
        double stepUpCoefficient = 1.1;
        double expected = basicScholarship * stepUpCoefficient;
        double actual = scholarshipCalculator.scholarshipCalculate(stepUpCoefficient);
        // match check with inaccuracy 0.01
        assertEquals(expected, actual, 0.01);
    }
}