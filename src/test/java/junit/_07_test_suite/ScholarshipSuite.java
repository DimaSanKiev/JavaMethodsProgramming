package junit._07_test_suite;

import junit._01_test_annotation.ScholarshipCalculatorTest1;
import junit._04_timeout.ScholarshipCalculatorTestTime;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({ScholarshipCalculatorTest1.class, ScholarshipCalculatorTestTime.class})
@RunWith(Suite.class)
public class ScholarshipSuite {
}
