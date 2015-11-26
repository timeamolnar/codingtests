package codingtests.test6_fizzbuzzwithlucky;

import com.google.common.base.Preconditions;

import java.io.PrintStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzWithLucky {

    public static void main(String... arguments) {
        FizzBuzzWithLucky fb = new FizzBuzzWithLucky();
        fb.checkCommandLineArguments(arguments);
        fb.convertNumberAndOut(Integer.valueOf(arguments[0]), System.out);
    }

    public void checkCommandLineArguments(String... arguments){
        Preconditions.checkArgument(arguments.length == 1, "Program must get exactly one argument");
        try{
            Integer.valueOf(arguments[0]);
        } catch (NumberFormatException ex){
            throw new IllegalArgumentException("Argument must be a valid number");
        }
    }

    public void convertNumberAndOut(int upperBound, PrintStream out){
        getFizzBuzzValuesForNumbers(1,upperBound).stream().forEach(out::println);
    }

    public List<String> getFizzBuzzValuesForNumbers(int firstNumber, int lastNumber){
        return IntStream.range(firstNumber,lastNumber+1).mapToObj(this::convertNumber).collect(Collectors.toList());
    }

    public String convertNumber(int nr) {
        Preconditions.checkArgument(nr > 0,"Number should be greater than 0!");

        if (String.valueOf(nr).contains("3")) return "lucky";
        if (nr % 15 == 0) return "fizzbuzz";
        if (nr % 3 == 0) return "fizz";
        if (nr % 5 == 0) return "buzz";

        return String.valueOf(nr);
    }
}
