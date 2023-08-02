package org.cydeo;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {

        // Create ArrayList and a class
        List<Student> students = new ArrayList<>();
        // Add Elements to ArrayList
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));
        //Iteration on ArrayList
        // 1. For loop with get(index)
        for(int i = 0; i < students.size(); i++) System.out.println(students.get(i));
        // 2. Iterator
            // Forward Iteration
        System.out.println("Printing with Iterator Forward .......");
        Iterator iter = students.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
            // Backwards Iteration
        System.out.println("Printing with Iterator Backwards .......");
        while(((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }
        // 3. for each loop
        System.out.println("Printing with For Each Loop .......");
        for(Student student : students) System.out.println(student);
        // 4. Lambda
        System.out.println("Printing with Lambda .......");
        students.forEach(s -> System.out.println(s));
        // Sorting Elements
        System.out.println("Printing with Sorting Elements Desc .......");
        Collections.sort(students, new sortByIdDescending());
        System.out.println(students);
        System.out.println("Printing with Sorting Elements Desc By Name .......");
        Collections.sort(students, new sortByNameDescending());
        System.out.println(students);

    }

    static class sortByIdDescending implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id- o1.id;
        }
    }

    static class sortByNameDescending implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareTo(o1.name);
        }
    }

}