package org.example;
import java.util.*;

public class Undo{
    private static Undo instance;
    private static final List<String> history = new ArrayList<>();

    private Undo () {}

    public static Undo getInstance() {
        if(instance == null) instance = new Undo();
        return instance;
    }

    public void addCommand(String commandStr) {
        history.add(commandStr);
    }

    public List<String> getHistory() {
        return history;
    }

}
