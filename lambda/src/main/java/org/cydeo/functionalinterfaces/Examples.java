package org.cydeo.functionalinterfaces;

import java.util.function.Predicate;

public class Examples {
    public static void main(String[] args) {

        //***********REDICATE************
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

    }
}
