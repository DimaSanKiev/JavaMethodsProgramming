package design_patterns._02_behavioral._04_iterator._02_example;

import java.util.HashMap;
import java.util.Map;

public class StudentSession implements Aggregate {
    private Map<String, Integer> exams = new HashMap();

    public CustomIterator createIterator() {
        CustomIterator iterator = new ExamsIterator(this);
        iterator.first();
        return iterator;
    }

    public void addExam(String name, Integer mark) {
        exams.put(name, mark);
    }

    public Integer getMark(String name) {
        return exams.get(name);
    }

    public Map<String, Integer> getExams() {
        return exams;
    }
}
