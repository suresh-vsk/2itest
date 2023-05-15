package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListReturn {

    public static List<Integer> getNonDuplicateSortedList(List<Integer> list, int min, int max) {
        if (list.stream().allMatch(i -> i >= min && i <= max)) {
            return list.stream()
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
        } else {
            throw new IllegalArgumentException("Input list " + list + " is not with in the range" + min + "and" + max);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(100);
        intList.add(24);
        intList.add(45);
        intList.add(99);
        intList.add(44);
        intList.add(77);
        intList.add(40);
        intList.add(87);
        intList.add(33);
        intList.add(62);
        List<Integer> newList = getNonDuplicateSortedList(intList, 1, 100);
        System.out.println("Sub list is");
        for (Integer a : newList) {
            System.out.print(a + " ");
        }
    }
}