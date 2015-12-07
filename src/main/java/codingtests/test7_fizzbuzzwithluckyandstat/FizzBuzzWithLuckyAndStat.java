package codingtests.test7_fizzbuzzwithluckyandstat;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;

import java.io.PrintStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzWithLuckyAndStat {

    public static void main(String... arguments) {
        FizzBuzzWithLuckyAndStat fb = new FizzBuzzWithLuckyAndStat();
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
        List<String> resultList = getFizzBuzzValuesForNumbers(1,upperBound);
        resultList.stream().forEach(s->out.print(s+" "));
        out.println();
        countAndOut("fizz", out, resultList);
        countAndOut("buzz", out, resultList);
        countAndOut("fizzbuzz", out, resultList);
        countAndOut("lucky", out, resultList);
        out.println("integer: " + resultList.stream().filter(s-> StringUtils.isNumeric(s)).count());
    }

    private void countAndOut(String filter, PrintStream out, List<String> list) {
        out.println(filter + ": " + list.stream().filter(s->s.equals(filter)).count());
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
