package junit._06_rule;

import junit._03_exceptions_test.NoSuchMarkException;
import junit._03_exceptions_test.ScholarshipCalculatorImpl3;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;

import java.io.File;
import java.io.IOException;

public class ScholarshipCalculatorTestRule {
    private static ScholarshipCalculatorImpl3 scholarshipCalculator;
    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();
    @Rule
    public final Timeout timeout = new Timeout(100);
    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void initScholarshipCalculator() {
        scholarshipCalculator = new ScholarshipCalculatorImpl3();
    }

    @Test
    public void writeResultTest() throws IOException {
        File file = folder.newFile("result.txt");
        scholarshipCalculator.writeResult(file);
    }

    @Test
    public void stepUpCoefficientCalculateTest() throws NoSuchMarkException {
        thrown.expect(NoSuchMarkException.class);
        scholarshipCalculator.stepUpCoefficientCalculate(11);
    }

    @Test
    public void writeResultTestTwo() throws IOException {
        thrown.expect(NullPointerException.class);
        scholarshipCalculator.writeResult(null);
    }
}
