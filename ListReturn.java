package org.example;

import java.util.ArrayList;
 import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ListReturn {

public static List<Integer> getNonDuplicateSortedList(int min, int max) {

    List<Integer> numbers = new ArrayList<>();
    for(int i = 0; i < 10; i++) {
        numbers.add(new Random().ints(min, (max + 1)).findFirst().getAsInt());
    }

    return numbers.stream()
            .distinct()
            .sorted()
            .collect(Collectors.toList());
}

public static void main(String[] args) {
    List<Integer> subList = getNonDuplicateSortedList(1, 100);
    System.out.println("Sub list is");
    for (Integer a : subList) {
        System.out.print(a + " ");
    }
  }
}