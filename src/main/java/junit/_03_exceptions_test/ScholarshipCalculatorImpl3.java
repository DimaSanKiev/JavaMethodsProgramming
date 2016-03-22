package junit._03_exceptions_test;

import junit._01_test_annotation.IScholarshipCalculator;

public class ScholarshipCalculatorImpl3 implements IScholarshipCalculator {
    public static final double BASIC_SCHOLARSHIP = 100;

    public double scholarshipCalculate(double stepUpCoefficient) {
        return BASIC_SCHOLARSHIP * stepUpCoefficient;
    }

    public double stepUpCoefficientCalculate(int averageMark) throws NoSuchMarkException {
        double stepUpCoefficient;
        switch (averageMark) {
            case 2: {
                stepUpCoefficient = 0;
                break;
            }
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
                throw new NoSuchMarkException("There is no mark: " + averageMark);
        }
        return stepUpCoefficient;
    }
}
