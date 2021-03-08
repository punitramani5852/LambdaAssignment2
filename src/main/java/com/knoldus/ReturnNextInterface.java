package com.knoldus;


import java.util.function.Function;

@FunctionalInterface
public interface ReturnNextInterface {

    Function<Integer,Integer> function();

}
