package com.korit.main;


import com.korit.util.ForEachPrinter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.korit.util.ForEachPrinter2.print;

// 제네릭
public class Main3 {
    public static boolean test() {
        return 10 % 2 == 0;
    }

    public static void main(String[] args) {
        String[] names = new String[] {"a", "b", "c"};
        Integer[] numbers = new Integer[] {1, 2, 3};

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.add(10);

        List<Integer> list3 = list.stream().collect(Collectors.toList());
        list3.add(20);


    }
}
