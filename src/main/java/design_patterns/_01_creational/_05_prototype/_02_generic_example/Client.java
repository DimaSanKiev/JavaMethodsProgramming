package design_patterns._01_creational._05_prototype._02_generic_example;

import java.util.List;

public interface Client<T> {
    T cloneElementById(Integer id);

    List<T> cloneElements(Object... param);

    // other methods
}
