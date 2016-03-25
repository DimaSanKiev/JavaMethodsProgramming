package junit._01_test_annotation;

public class ScholarshipCalculatorImpl1 implements IScholarshipCalculator {
    public static final double BASIC_SCHOLARSHIP = 100;

    public double scholarshipCalculate(double stepUpCoefficient) {
        return BASIC_SCHOLARSHIP * stepUpCoefficient;
    }
}
