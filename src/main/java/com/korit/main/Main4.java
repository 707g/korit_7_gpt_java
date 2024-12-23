package com.korit.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numberList2 = null;
        List<Integer> numberList3 = null;

        // 1-1)
        numberList2 = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            numberList2.add(numberList.get(i) * 10);
        }

        // 1-2)
        numberList2 = new ArrayList<>();
        for (Integer num : numberList) {
            numberList2.add(num * 10);
        }

        // 2-1)
        numberList3 = numberList.stream()
                .map(number -> number * 10)
                .collect(Collectors.toList());

        // 1-3)
        // final List<Integer> numberList4 = new ArrayList<>();
        // numberList.forEach(n -> numberList4.add(n * 10));

        System.out.println(numberList);
        System.out.println(numberList2);
        System.out.println(numberList3);

    }
}
