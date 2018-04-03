package com.thoughtworks.collection;

import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().mapToInt(n -> n).max().getAsInt();
    }

    public double getMinimum() {
        return arrayList.stream().mapToInt(n -> n).min().getAsInt();
    }

    public double getAverage() {
        return arrayList.stream().mapToInt(n -> n).average().getAsDouble();
    }

    public double getOrderedMedian() {
        double res = arrayList.get((arrayList.size() - 1) / 2);
        return arrayList.size() % 2 == 0 ? (res + arrayList.get(arrayList.size() / 2)) / 2.0 : res;
    }

    public int getFirstEven() {
        return arrayList.stream().filter(n -> n % 2 == 0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        int i = 0;
        for (; i < arrayList.size() && arrayList.get(i) % 2 != 0; i++) ;
        return i;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (this.arrayList.size() != arrayList.size()) {
            return false;
        }
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) != arrayList.get(i)) {
                return false;
            }
        }
        return true;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink<Integer> singleLink) {
        /*singleLink = new SingleLinkImpl<>();*/
        for (Integer integer : arrayList) {
            singleLink.addTailPointer(integer);
        }
        return (singleLink.getNode(6) + singleLink.getNode(7)) / 2.0;
    }

    public int getLastOdd() {
        Collections.reverse(arrayList);
        return arrayList.stream().filter(n -> n % 2 != 0).findFirst().get();
    }

    public int getIndexOfLastOdd() {
        int i = arrayList.size() - 1;
        for (; i >= 0 && arrayList.get(i) % 2 == 0; i--) ;
        return i;
    }

}
