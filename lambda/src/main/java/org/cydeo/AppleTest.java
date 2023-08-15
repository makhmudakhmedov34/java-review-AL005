package org.cydeo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));



//        List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
//        System.out.println(heavyApple);

        Predicate<Apple> heavyApplePredicate = a -> a.getWeight()>200;
        System.out.println(filterApples(inventory,heavyApplePredicate));

//        List<Apple> greenApple = filterApples(inventory,AppleGreenColorPredicate());
//        System.out.println(greenApple);

        Predicate<Apple> greenApplePredicate = a -> a.getColor().equals(Color.GREEN);
        System.out.println(filterApples(inventory,greenApplePredicate));


    }

//    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
//
//        List<Apple> result = new ArrayList<>();
//
//        for(Apple apple:inventory){
//            if(applePredicate.test(apple)){
//                result.add(apple);
//            }
//        }
//        return result;
//    }

    private static List<Apple> filterApples(List<Apple> inventory,Predicate<Apple> applePredicate) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple:inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
