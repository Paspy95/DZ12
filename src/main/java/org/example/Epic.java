package org.example;

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    @Override
    public boolean matches(String query) {
        int numberSubtasks = subtasks.length;
        for (int i = 0; i < numberSubtasks; i++) {
            if (subtasks[i].contains(query)) {
                return true;
            }
        }
        return false;
    }
}