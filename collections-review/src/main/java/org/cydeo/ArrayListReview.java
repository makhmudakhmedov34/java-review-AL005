package org.cydeo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReview {
    public static void main(String[] args) {

        // Create ArrayList and a class
        List<Student> students = new ArrayList<>();
        // Add Elements to ArrayList
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));

        System.out.println(students);

        //Iteration on ArrayList
        // 1. For loop with get(index)
        // 2. Iterator
            // Forward Iteration
            // Backwards Iteration

        // 3. for each loop
        // 4. Lambda

        // Sorting Elements
    }
}