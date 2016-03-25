package junit._09_run_listener;

import junit._03_exceptions_test.NoSuchMarkException;
import junit._03_exceptions_test.ScholarshipCalculatorImpl3;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;

@RunWith(ScholarshipRunner.class)
public class ScholarshipCalculatorTestRule {
    private static ScholarshipCalculatorImpl3 scholarshipCalculator;

    @BeforeClass
    public static void initScholarshipCalculator() {
        scholarshipCalculator = new ScholarshipCalculatorImpl3();
    }

    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();

    @Rule
    public final Timeout timeout = new Timeout(300);

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void writeResultTest() throws IOException {
        File file = folder.newFile("a:/result.txt");    // test will be failed
        scholarshipCalculator.writeResult(file);
    }

    @Test
    public void stepUpCoefficientCalculateTest() throws NoSuchMarkException {
        thrown.expect(NoSuchMarkException.class);
        scholarshipCalculator.stepUpCoefficientCalculate(11);
    }

    @Ignore
    @Test
    public void writeResultTest2() throws IOException {
        thrown.expect(NullPointerException.class);
        scholarshipCalculator.writeResult(null);
    }
}
