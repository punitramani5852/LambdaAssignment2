package com.knoldus;

import java.util.function.Function;

public class ReturnNextEven {



        public static Function<Long, Long> getNextEvenFunction = (n) -> (n & 1) == 1 ? n + 1 : n + 2;



}
