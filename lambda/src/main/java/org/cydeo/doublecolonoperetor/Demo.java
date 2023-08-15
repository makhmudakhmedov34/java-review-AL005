package org.cydeo.doublecolonoperetor;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {

     // Reference to a static method
        Calculate s1 = (x, y) -> Calculator.findSum(x,y);
        s1.calculate(10,20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(100,35);
        //Reference to instance method
        Calculate m1 = (x,y) -> new Calculator().findMultiply(x,y);
        m1.calculate(10,20);

        Calculate m2 = new Calculator()::findMultiply;
        m2.calculate(8,9);

        BiFunction<String,Integer,String> fn = (st,i) -> st.substring(i);
        System.out.println(fn.apply("Developer",3));

        BiFunction<String,Integer,String> fn2 = String::substring;
        System.out.println(fn.apply("Developer",3));

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(5);


    }
}