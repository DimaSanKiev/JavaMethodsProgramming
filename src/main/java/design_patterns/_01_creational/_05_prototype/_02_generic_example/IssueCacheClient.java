package design_patterns._01_creational._05_prototype._02_generic_example;

import java.util.ArrayList;
import java.util.List;

public class IssueCacheClient implements Client<Issue> {    // Prototype
    private List<Issue> cache;

    public IssueCacheClient() {
        cache = new ArrayList<Issue>();
    }

    public IssueCacheClient(List<Issue> issueList) {
        this.cache = issueList;
    }

    @Override
    public Issue cloneElementById(Integer id) {
        for (Issue issue : cache) {
            if (issue.getId().equals(id)) {
                return issue.clone();
            }
        }
        throw new IllegalArgumentException("illegal ID " + id);
    }

    @Override
    public List<Issue> cloneElements(Object... param) {
        ArrayList<Issue> list = new ArrayList<>();
        // search, clone and organizing new collection implementation
        return list;
    }


}
