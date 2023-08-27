package org.cydeo;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,70);


        //toCollection(Supplier) : is used to create a collection using collector
        System.out.println("*************TOCOLLECTION()*****************");
        List<Integer> numberList = numbers.stream()
                .filter(i -> i%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(i -> i%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);
        // toList() : returns a Collectors interface that gathers the input data into a new list
        System.out.println("*************TOList()*****************");
        List<Integer> numberList2 = numbers.stream()
                .filter(i -> i%2==0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        // toSet(): returns a Collector interface that gathers the input data into a new set
        System.out.println("*************TOSet()*****************");
        Set<Integer> numberSet2 = numbers.stream()
                .filter(i -> i%2==0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        // toMap(Function,Function) : returns a Collector interface that gathers the input data into a new map
        System.out.println("*************TOMap()*****************");
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        // counting() : returns a Collectors that counts the number of the elements
        System.out.println("*************Counting()*****************");
        Long evenCount = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        // summingInt(ToIntFunction) : returns a Collector that produce the sum of a integer - value func
        System.out.println("*************summingInt(ToIntFunction)*****************");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);
        // averagingInt(ToIntFunction) : returns the average of the integers passed values
        System.out.println("*************averagingInt(ToIntFunction)*****************");
        Double average = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(average);

        // joining() : is used to join various elements of a characters or string array into a single string object
        System.out.println("*************joining()*****************");
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        // partionningBy() : is used to partition a stream of objects(or set of elements) based on a given predicate
        System.out.println("**********************PartionningBy()*********************");
        Map<Boolean,List<Dish>> veggieDish =  DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        // groupingBy() : is used for groping objects by same property and storing results in a map instance
        System.out.println("*****************GroupingBy()**************************");
        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);

    }
}
