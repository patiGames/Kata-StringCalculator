package com.kata.stringCalculator;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class StringCalculator {

    public int add(String numbers) {

        numbers = standardiseSeparators(numbers);

        List<Integer> numberList = asList(numbers.split(","))
                                                .stream()
                                                .map(n -> "0"+n )
                                                .map(Integer::valueOf)
                                                .collect(Collectors.toList());

        int sumTotal = 0;

        for (Integer number : numberList) {
            sumTotal += number;
        }

        return sumTotal;
    }

    private String standardiseSeparators(String numbers) {

        boolean hasCustomSeparators = (numbers.indexOf("//") == 0);

        if(hasCustomSeparators) {

            String customSeparator = numbers.substring(2,3);
            numbers = numbers.substring(4);
            numbers = numbers.replace(customSeparator , ",");
        }

        numbers = numbers.replace("\n", ",");

        return numbers;
    }

}
