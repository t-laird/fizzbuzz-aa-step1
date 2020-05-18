package Utilities;

import Constants.FizzBuzzResults;
import Exeptions.FizzBuzzException;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzUtil {
    public static void validateInputs(int start, int end) throws FizzBuzzException {
        if (start > end) {
            throw new FizzBuzzException("Invalid Range");
        }
    }

    public static List<Integer> createRange(int start, int end) {
        List<Integer> nums = new ArrayList<>();

        for (int i = start ; i <= end ; i++) {
            nums.add(i);
        }

        return nums;
    }

    public static String getFizzBuzzStringForNum(int num) {
        if (num % 15 == 0) {
            return FizzBuzzResults.FIZZBUZZ;
        } else if (num % 3 == 0) {
            return FizzBuzzResults.FIZZ;
        } else if (num % 5 == 0) {
            return FizzBuzzResults.BUZZ;
        } else {
            return String.valueOf(num);
        }
    }
}
