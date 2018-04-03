package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {
    }

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        int minus = random.nextInt(3);
        return IntStream.range(0, number).boxed()
                .sorted((a, b) -> -a.compareTo(b))
                .filter(num -> (number - num) % minus == 0)
                .collect(Collectors.toList());
    }
}
