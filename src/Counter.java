/*
Name: Sean Fox
Date: 5-19-19
Class: CIT-130
Purpose: Assignment 2, Part 2 - Write a Counter class
*/

public class Counter {

    private int count;

    public Counter() {
        count = 0;
    }

    public Counter(int value) {
        setInitialCount(value);
    }

    private void setInitialCount(int initialCount) {
        if(initialCount >= 0)
            count = initialCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int newCount) {
        count = newCount;
    }

    public void incrementCount() {
        setCount(count + 1);
    }

    public void decrementCount() {
        if(getCount() >= 1)
            setCount(count - 1);
        else
            System.out.println("Error: Counter cannot be decremented below zero.");
    }

    public String toString() {
        return "The current count is " + count;
    }

    public boolean equals(Counter otherCounter) {
        return this.getCount() == otherCounter.getCount();
    }
}
