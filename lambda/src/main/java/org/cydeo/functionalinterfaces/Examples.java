package org.cydeo.functionalinterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {

        System.out.println("***********PREDICATE************");
//        Predicate<Integer> lessThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//
//        lessThan.test(50);

        Predicate<Integer> lesserThan = a -> a<18;
        System.out.println(lesserThan.test(50));


        System.out.println("***********Consumer************");
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(100);

        System.out.println("***********BiConsumer************");

        BiConsumer<Integer,Integer> display2 = (i,b) -> System.out.println(i+b);
        display2.accept(100,200);

        System.out.println("***********Function************");

        Function<String,String> fun = s -> "Hello "+s;
        System.out.println(fun.apply("World"));

        System.out.println("***********Supplier************");

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());






    }
}
