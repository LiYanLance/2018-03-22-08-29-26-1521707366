package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = IntStream.rangeClosed(Math.min(left, right), Math.max(left, right)).boxed().collect(Collectors.toList());
        if (left > right) {
            Collections.reverse(list);
        }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = IntStream.rangeClosed(Math.min(left, right), Math.max(left, right))
                .filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());
        if (left > right) {
            Collections.reverse(list);
        }
        return list;

    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).boxed().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array == null ? -1 : array.length <= 0 ? -1 : array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        return Arrays.stream(firstArray).boxed().filter(n -> Arrays.stream(secondArray).anyMatch(i -> i == n)).collect(Collectors.toList());
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        return Stream.concat(Arrays.stream(firstArray), Arrays.stream(secondArray)).distinct().collect(Collectors.toList());
    }
}
