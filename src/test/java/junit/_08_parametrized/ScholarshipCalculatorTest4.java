package junit._08_parametrized;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ScholarshipCalculatorTest4 {
    // parameters declaration as fields
    private int averageMark;
    private double stepUpCoefficient;

    // public constructor with parameters for fields initialization

    public ScholarshipCalculatorTest4(int averageMark, double stepUpCoefficient) {
        this.averageMark = averageMark;
        this.stepUpCoefficient = stepUpCoefficient;
    }

    // parameters set definition as a collection
    @Parameterized.Parameters
    public static Collection<Object[]> stepUpCoefficientTableValues() {
        return Arrays.asList(new Object[][] {
                {3, 1.0},
                {4, 1.3},
                {5, 1.5}
        });
    }

    @Test
    public void stepUpCoefficientTest() throws NoSuchMarkException {
        ScholarshipCalculatorImpl3 scholarshipCalculator = new ScholarshipCalculatorImpl3();
        double expected = this.stepUpCoefficient;
        double actual = scholarshipCalculator.stepUpCoefficientCalculate(this.averageMark);
        assertEquals(expected, actual, 0.01);
    }
}
