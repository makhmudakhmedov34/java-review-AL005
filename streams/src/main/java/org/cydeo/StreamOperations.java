package org.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4,5,3,6,5,9);
       // filter.forEach(x -> System.out.println(x));
        myList.forEach(System.out::println);
        //Filter
        System.out.println("Filter");
        myList.stream().
                filter(i -> i%3==0 ).
                distinct().
                forEach(System.out::println);
        //Limit
        System.out.println("Limit");
        myList.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);
        //Skip
        System.out.println("Skip");
        myList.stream()
                .filter(i -> i%2==0)
                .skip(2)
                .forEach(System.out::println);
        //MAP
        System.out.println("Map");
        myList.stream()
                .filter(i -> i%2==0)
                .map(i -> i*3)
                .forEach(System.out::println);





    }

}
