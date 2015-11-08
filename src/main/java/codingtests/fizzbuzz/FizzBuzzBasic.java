package codingtests.fizzbuzz;


import com.google.common.base.Preconditions;

import java.io.PrintStream;
import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FizzBuzzBasic {

    public static void main(String... arguments) {
        FizzBuzzBasic fb = new FizzBuzzBasic();
        fb.checkCommandLineArguments(arguments);
        fb.convertToFizzBuzzAndOut(Integer.valueOf(arguments[0]), System.out);
    }

    public void convertToFizzBuzzAndOut(int upperBound, PrintStream out){
        getFizzBuzzValuesForNumbers(1,upperBound).stream().forEach(out::println);
    }

    public void checkCommandLineArguments(String... arguments){
        Preconditions.checkArgument(arguments.length == 1, "Program must get exactly one argument");
        try{
            Integer.valueOf(arguments[0]);
        } catch (NumberFormatException ex){
            throw new IllegalArgumentException("Argument must be a valid number");
        }
    }

    public List<String> getFizzBuzzValuesForNumbers(int firstNumber, int lastNumber){
        return IntStream.range(firstNumber,lastNumber+1).mapToObj(this::convertNumberToFizzBuzz).collect(Collectors.toList());
    }

    public String convertNumberToFizzBuzz(int number){
        Preconditions.checkArgument(number > 0,"Number should be greater than 0!");

        if (number % 15 == 0) return "fizzbuzz";
        if (number % 3 == 0) return "fizz";
        if (number % 5 == 0) return "buzz";

        return String.valueOf(number);
    }


}
