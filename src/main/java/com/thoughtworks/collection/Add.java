package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        return IntStream.rangeClosed(Math.min(leftBorder,rightBorder), Math.max(leftBorder,rightBorder)).filter(n-> n % 2 == 0).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        return IntStream.rangeClosed(Math.min(leftBorder,rightBorder), Math.max(leftBorder,rightBorder)).filter(n-> n % 2 != 0).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(n-> 3*n+2).reduce(0, (x, y) -> x + y);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(n-> n % 2 == 0 ? n: n * 3 + 2).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(n-> n % 2 != 0).map(n-> n * 3 + 5).reduce(0, (x, y)-> x + y);
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        arrayList.stream().filter(n -> n % 2 == 0);
        double res = arrayList.get((arrayList.size() - 1) / 2);
        return arrayList.size() % 2 == 0 ? (res + arrayList.get(arrayList.size() / 2)) / 2.0 : res;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(n-> n % 2 == 0).mapToInt(n-> n).average().orElse(0);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.stream().anyMatch(n -> n % 2 == 0 && n == specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(n-> n % 2 == 0).distinct().collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        arrayList.sort((a, b)->{
            if (a % 2 == 0) {
                return b % 2 == 0 ? a.compareTo(b) : -1;
            }else {
                return b % 2 == 0 ? 1 : -a.compareTo(b);
            }
        });
        return arrayList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            list.add(i, (arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }
        return list;
    }
}
