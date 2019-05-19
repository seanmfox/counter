/*
Name: Sean Fox
Date: 5-19-19
Class: CIT-130
Purpose: Assignment 2, Part 2 - Write a test program for the Counter class
*/

public class TestCounter {

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter(2);

        System.out.println("Initial values:");

        //Verify value for default constructor
        System.out.println("Counter1: " + c1);

        //Verify value for constructor with argument
        System.out.println("Counter2: " + c2);

        if(c1.equals(c2))
            System.out.println("Counter1 equals Counter2");
        else
            System.out.println("Counter1 does not equal Counter2");

        System.out.println();

        // Counter return error message if negative number attempted
        c1.decrementCount();

        System.out.println();

        //Increment Counter1
        c1.incrementCount();
        System.out.println("Counter1: " + c1);
        System.out.println("Counter2: " + c2);
        if(c1.equals(c2))
            System.out.println("Counter1 equals Counter2");
        else
            System.out.println("Counter1 does not equal Counter2");

        System.out.println();

        // Decrement Counter2 to test equality as true
        c2.decrementCount();
        System.out.println("Counter1: " + c1);
        System.out.println("Counter2: " + c2);
        if(c1.equals(c2))
            System.out.println("Counter1 equals Counter2");
        else
            System.out.println("Counter1 does not equal Counter2");
    }
}
