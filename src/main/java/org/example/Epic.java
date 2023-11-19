package org.example;

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    @Override
    public boolean matches(String query) {
        if (subtasks[0].contains(query)) {
            return true;
        }
        if (subtasks[1].contains(query)) {
            return true;
        }
        if (subtasks[2].contains(query)) {
            return true;
        }
        return false;
    }
}
