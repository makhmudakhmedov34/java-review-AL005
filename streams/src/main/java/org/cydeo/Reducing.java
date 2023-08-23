package org.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(4,5,3,9);
        int result =numbers.stream().reduce(0,(a,b) ->(a+b));
        System.out.println(result);

        //No initial2 value
        Optional<Integer> result2 = numbers.stream().reduce((a,b) -> a+b);
        System.out.println(result2);

        // Max and Min
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println(max.get());
        System.out.println(min.get());
        System.out.println(sum.get());

        int dishCount = DishData.getAll().stream()
                .map(d ->1)
                .reduce(Integer::sum).get();
        System.out.println(dishCount);

        int dishCount2 = DishData.getAll().stream()
                .map(d ->1)
                .reduce(0,(a,b) -> a+b);
        System.out.println(dishCount2);

        long count = DishData.getAll().stream().count();
        System.out.println(count);






    }
}
