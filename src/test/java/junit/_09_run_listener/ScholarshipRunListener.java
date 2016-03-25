package junit._09_run_listener;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class ScholarshipRunListener extends RunListener {
    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("Test started: " + description.getMethodName());
    }

    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("Test finished: " + description.getMethodName() + "\n----");
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("Test failed with exception: " + failure.getException());
    }

    @Override
    public void testIgnored(Description description) throws Exception {
        System.out.println("Test ignored: " + description.getMethodName() + "\n----");
    }

    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("Tests results:");
        System.out.println("Execution time: (" + result.getRunTime() + ") millis");
        System.out.println("Tests ran: " + result.getRunCount());
        System.out.println("Tests failed: " + result.getFailureCount());
        System.out.println("Tests ignored: " + result.getIgnoreCount());
        System.out.println("All tests finished successful: " + result.wasSuccessful());
    }
}
