package com.revature;

public class Task {
    
    // state
    private String name;
    private boolean isComplete;

    // constructors
    public Task(){}

    public Task(String name) {
        this.name = name;
    }

    public Task(String name, boolean isComplete) {
        this.name = name;
        this.isComplete = isComplete;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    @Override
    public String toString() {
        return isComplete ? "[x] " + this.getName() : "[ ] " + this.getName();
    }
}
