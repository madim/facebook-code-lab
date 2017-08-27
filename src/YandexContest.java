import java.util.Scanner;

/**
 * Created by madi on 5/3/17.
 */
public class YandexContest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        if (t.equals(s)) {
            System.out.print("Yes");
            return;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for (int i = 0; i < tArr.length; i++) {
            if (s.indexOf(tArr[i]) == -1) {
                System.out.print("No");
                return;
            }
        }

        while (t.length() != s.length()) {
            t += t;
        }

        if (t.equals(s)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

        /*int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);

        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            int curr = a[i];
            int next = a[i + 1];
            if (curr != next) {
                count++;
            } else count--;
        }

        System.out.print(count);*/

        /*long x = 0;
        for (long i = 0; i < n; i++) {
            if (Math.pow(i, 2) <= n) {
                x++;
            }
        }

        System.out.print(x);*/
    }
}
