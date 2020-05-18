import Exeptions.FizzBuzzException;
import Utilities.FizzBuzzLogger;
import Utilities.FizzBuzzUtil;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
public class FizzBuzz {

    public static void main(String[] args) throws FizzBuzzException {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        List<String> result = fizzBuzz(start, end);

        FizzBuzzLogger.printResult(result);
    }

    private static List<String> fizzBuzz(int start, int end) throws FizzBuzzException {
        FizzBuzzUtil.validateInputs(start, end);

        return FizzBuzzUtil.createRange(start, end).stream()
                .map(FizzBuzzUtil::getFizzBuzzStringForNum)
                .collect(Collectors.toList());
    }
}
