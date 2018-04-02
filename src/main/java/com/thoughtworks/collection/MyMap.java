package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(n -> n * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream().map(n -> letters[n]).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        return array.stream().map(num -> (num > 26 ? letterList.get((num - 1) / 26 - 1) : "")
                + letterList.get((num - 1) % 26)).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted((a, b) -> -a.compareTo(b)).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
