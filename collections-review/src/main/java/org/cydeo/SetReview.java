package org.cydeo;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public class SetReview {
    public static void main(String[] args) {

        //1. create a set
        Set<Student> mySet = new HashSet<>();

        //2. add element
        mySet.add(new Student(7,"Ibadet"));
        mySet.add(new Student(8,"Ahmet"));
        mySet.add(new Student(9,"Myhabbat"));
        mySet.add(new Student(9,"Myhabbat"));

        System.out.println(mySet);

        Set<Integer> nuSet = new HashSet<>();
        nuSet.add(1);
        nuSet.add(2);
        System.out.println(nuSet);
        System.out.println(nuSet.add(2));
        System.out.println("first repeatingL: "+firstRepeatingChar("java developer"));
    }
    public static Character firstRepeatingChar(String str){
        // Create s Hashmap
        Set<Character> chars = new HashSet<>();
        // Iteration return ch if add returns false
        for(Character ch: str.toCharArray()) if(!chars.add(ch)) return ch;
        return null;
    }
}
