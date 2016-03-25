package junit._09_run_listener;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class ScholarshipRunner extends BlockJUnit4ClassRunner {
    private ScholarshipRunListener runListener;


    public ScholarshipRunner(Class<ScholarshipRunListener> klass) throws InitializationError {
        super(klass);
        runListener = new ScholarshipRunListener();
    }

    public void run(RunNotifier notifier) {
        notifier.addListener(runListener);
        super.run(notifier);
    }
}
