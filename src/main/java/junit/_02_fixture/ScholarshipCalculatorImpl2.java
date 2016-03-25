package junit._02_fixture;

import junit._01_test_annotation.IScholarshipCalculator;

public class ScholarshipCalculatorImpl2 implements IScholarshipCalculator {
    public static final double BASIC_SCHOLARSHIP = 100;

    public double scholarshipCalculate(double stepUpCoefficient) {
        return BASIC_SCHOLARSHIP * stepUpCoefficient;
    }

    public double stepUpCoefficientCalculate(int averageMark) {
        double stepUpCoefficient;
        switch (averageMark) {
            case 3: {
                stepUpCoefficient = 1;
                break;
            }
            case 4: {
                stepUpCoefficient = 1.3;
                break;
            }
            case 5: {
                stepUpCoefficient = 1.5;
                break;
            }
            default:
                stepUpCoefficient = 0;
        }
        return stepUpCoefficient;
    }
}
