package com.streams.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

//Using the Function<T,V> interface
public class _Function {
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 =
            number -> number * 10;
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    public static void main(String[] args) {
        //Function take one argument and produces one result
        int increment = increment(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndTheMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10);

        System.out.println((addBy1AndTheMultiplyBy10.apply(1)));

        //BiFunction takes 2 arguments and produces 1 result
        //Regular java way with methods
        System.out.println(
                incrementByOneAndMultiply(4, 100)
        );

        //Using BiFunction
        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4, 100)
        );

    }

    static int increment(int number) {
        return ++number;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (++number) * numToMultiplyBy;
    }
}
