package org.example;

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    @Override
    public boolean matches(String query) {
        int sabtaskMax=3;
        for (int i = 0; i < sabtaskMax; i++) {
            if (subtasks[i].contains(query)) {
                return true;
            }
        }
        return false;
    }
}