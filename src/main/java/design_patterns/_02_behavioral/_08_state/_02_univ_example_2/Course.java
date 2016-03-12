package design_patterns._02_behavioral._08_state._02_univ_example_2;

public class Course {       // Context class
    private long id;
    private String name;
    private Teacher teacher;
    private IState currentState;

    public Course(long id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        currentState = new StartState();
    }

    // getters and setters
    public void setTeacher(Teacher teacher) {
        // name and course id check on teacher's specialization
        this.teacher = teacher;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public IState getCurrentState() {
        System.out.println(currentState.getClass().getSimpleName());
        return currentState;
    }

    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }

    public void learning() {
        currentState.learning();
    }

    public void cancel() {
        currentState.toCancel();
    }

    // state class
    public class StartState implements IState {
        private IState nextState;

        @Override
        public void learning() {
            if (Course.this.teacher != null) {
                currentState = new ProcessState();
                System.out.println("studying starts");
            } else {
                this.toCancel();
                System.out.println("studying doesn't start: no teacher");
            }
        }

        @Override
        public void toCancel() {
            currentState = new CancelledState();
            System.out.println("studying course cancelled");
        }
    }

    // state class
    private class ProcessState implements IState {
        private IState nextState = new EndState();

        @Override
        public void learning() {
            currentState = nextState;
            System.out.println("studying finished successfully");
            // reporting
            // saving results
        }

        @Override
        public void toCancel() {
            throw new UnsupportedOperationException("cannot cancel already started course");
        }
    }

    // state class
    private class EndState implements IState {
        private IState nextState = new StartState();

        @Override
        public void learning() {
            currentState = nextState;
            // new teacher appointment
            Course.this.setTeacher(new Teacher());
            System.out.println("course is ready to start");
        }

        @Override
        public void toCancel() {
            throw new UnsupportedOperationException("course is already finished, cannot cancel");
        }
    }

    // state class
    private class CancelledState implements IState {
        private IState nextState = new EndState();

        @Override
        public void learning() {
            currentState = new StartState();
            // new teacher appointment
            Course.this.setTeacher(new Teacher());
            System.out.println("course is ready to be continue");
        }

        @Override
        public void toCancel() {
            throw new UnsupportedOperationException("course is already cancelled");
        }
    }
}
