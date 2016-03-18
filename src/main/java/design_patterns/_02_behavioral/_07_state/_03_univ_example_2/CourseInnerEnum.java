package design_patterns._02_behavioral._07_state._03_univ_example_2;

// Context class
public class CourseInnerEnum {
    private long id;
    private String name;
    private Teacher teacher;
    private static State currentState;

    enum State {
        // start nested enum State
        START {
            private State nextState;

            public void learning() {
                currentState = PROCESS;
            }

            public void toCancel() {
                currentState = CANCELLED;
                System.out.println("studying course cancelled");
            }
        },
        PROCESS {
            private State nextState;

            public void learning() {
                currentState = nextState;
                System.out.println("studying finished successfully");
                // reporting
                // saving results
            }

            public void toCancel() {
                throw new UnsupportedOperationException("cannot cancel already started course");
            }
        },
        CANCELLED {
            private State nextState;

            public void learning() {
                currentState = START;
                System.out.println("course is ready to be continue");
            }

            public void toCancel() {
                throw new UnsupportedOperationException("course is already cancelled");
            }
        },
        END {
            private State nextState;

            public void learning() {
                currentState = nextState;
                System.out.println("course is ready to start");
            }

            public void toCancel() {
                throw new UnsupportedOperationException("course is already finished, cannot cancel");
            }
        };

        abstract void learning();

        abstract void toCancel();
    }
    // end nested enum State


    public CourseInnerEnum(long id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        currentState = State.START;
    }

    public void setTeacher(Teacher teacher) {
        // name and course id check on teacher's specialization
        this.teacher = teacher;
    }

    public static State getCurrentState() {
        System.out.println(currentState);
        return currentState;
    }

    public void learn() {
        currentState.learning();
    }

    public void cancel() {
        currentState.toCancel();
    }

    // getters and setters
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

    public static void setCurrentState(State currentState) {
        CourseInnerEnum.currentState = currentState;
    }
}
