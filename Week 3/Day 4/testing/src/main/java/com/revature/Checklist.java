package com.revature;

import java.util.ArrayList;

public class Checklist {
    
    // state
    private ArrayList<Task> tasks;

    // constructors
    public Checklist() {
        tasks = new ArrayList<>();
    }

    // behavior

    // create
    public boolean createTask(String name) {
        // validation check
        if (name.isBlank()) {
            throw new IllegalArgumentException("Invalid input: you must enter at least one non-whitespace character.");
        }

        // create task
        Task taskToAdd = new Task(name);

        // return success value and add task to tasks
        return tasks.add(taskToAdd);
    }

    // remove
    public boolean removeTask(String name) {
        for (Task task : tasks) {
            if (task.getName().equalsIgnoreCase(name)) {
                return tasks.remove(task);
            }
        }
        
        return false;
    }
    
    // toggle completion
    public void toggleTask(String name) {
        for (Task task : tasks) {
            if (task.getName().equalsIgnoreCase(name)) {
                task.setComplete(!task.isComplete());
            }
        }
    }

    // view
    @Override
    public String toString() {
        String list = "To Do List:";
        for (Task task : tasks) {
            list += "\n" + task;
        }
        
        return list;
    }
    


}
