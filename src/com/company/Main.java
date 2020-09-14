package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        list.add(1.5);
        list.add(4);
        list.add(0.5);
        list.add(4.01f);
        list.add(0.12);
        list.add(-1);
        list.add(10);
        System.out.println(CollectionUtils.range(list, 0, 4, new Comparator<Number>() {
            @Override
            public int compare(Number o1, Number o2) {
                Double x = o1.doubleValue();
                Double y= o2.doubleValue();
                return x.compareTo(y);
            }
        }));
        List<Number> list2 = new ArrayList<>();
        list2.add(1.5);
        list2.add(-5555);
        System.out.println(CollectionUtils.containsAny(list,list2));
        System.out.println(CollectionUtils.containsAll(list,list2));
    }
}
