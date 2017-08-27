import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by madi on 4/8/17.
 */
public class TidyNumbers {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        Scanner scanner = new Scanner(new File("B-small-attempt0.in"));

        int T = scanner.nextInt();
        BigInteger[] Ts = new BigInteger[T];
        for (int i = 0; i < T; i++) {
            Ts[i] = scanner.nextBigInteger();
        }

        BigInteger[] tidyNums = new BigInteger[T];

        for (int i = 0; i < T; i++) {
            List<Integer> digits = getDigits(Ts[i].intValue());
            for (int j = 0; j < digits.size() - 1; j++) {
                int current = digits.get(j);
                int next = digits.get(j + 1);
                if (current < next) {
                    digits.set(j, 9);
                    digits.set(j + 1, next - 1);
                }
            }

            Collections.reverse(digits);
            String tidy = "";
            for (int s : digits) {
                tidy += s;
            }

            tidyNums[i] = BigInteger.valueOf(Long.valueOf(tidy));
        }

        for (int i = 1; i <= T; i++) {
            System.out.println("Case #" + i + ": " + tidyNums[i - 1]);
        }

    }

    private static boolean isTidy(int num) {
        String regex = "^0*1*2*3*4*5*6*7*8*9*$";
        return String.valueOf(num).matches(regex);
    }

    private static List<Integer> getDigits(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number = number / 10;
        }

        return digits;
    }

    private static LinkedList<Long> getDigits(long number) {
        LinkedList<Long> stack = new LinkedList<Long>();
        while (number > 0) {
            stack.push(number % 10);
            number = number / 10;
        }

        return stack;
    }

    private static boolean isNumTidy(long number) {
        LinkedList<Long> stack = new LinkedList<Long>();
        while (number > 0) {
            stack.push(number % 10);
            number = number / 10;
        }

        List<Long> digits = new ArrayList<>();

        while (!stack.isEmpty()) {
            digits.add(stack.pop());
        }

        for (int i = 1; i < digits.size(); i++) {
            if (digits.get(i) < digits.get(i - 1)) {
                return false;
            }
        }

        return true;
    }
}
