import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] gas = {1, 7, 7, 7, 3};
        int[] coins = {1,2,5};
        System.out.print(f(coins, 11));
    }

    public static int f(int[] c, int x) {
        if (x == 0) return 0;
        if (x < 0) return -1;
        int u = -1;
        for (int i = 1; i <= c.length; i++) {
            u = Math.min(u, f(c, x - c[i]) + 1);
        }
        return u;
    }

    public static int coinChange(int[] coins, int amount) {
        if (coins.length == 1) {
            if (coins[0] > amount) {
                return -1;
            }


        }

        Arrays.sort(coins);
        int count = 0;
        int sum = 0;
        int lastIndex = coins.length - 1;

        while (sum < amount) {
            while (sum + coins[lastIndex] > amount) {
                lastIndex--;
            }
            sum += coins[lastIndex];
            count++;
        }

        return count;
    }

    public static int hammingDistance(int x, int y) {
        int count = 0;
        int val = x ^ y;
        while (val != 0) {
            count++;
            val &= val - 1;
        }
        return count;
    }

    private static void bfs(int n, int m, int num) {
        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        while (!q.isEmpty()) {
            int stepNum = q.poll();

            if (stepNum == 0 || stepNum == 9) {
                continue;
            }
            int lastDigit = stepNum % 10;
            int prevNum = lastDigit * 10 + lastDigit - 1;
            int nextNum = lastDigit * 10 + lastDigit + 1;

            if (lastDigit == 0) {
                q.add(nextNum);
            } else if (lastDigit == 9) {
                q.add(prevNum);
            } else {
                q.add(prevNum);
                q.add(nextNum);
            }

        }
    }

    public static ArrayList<Integer> stepnum(int a, int b) {
        ArrayList<Integer> stepnums = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (isstepnum(i)) {
                stepnums.add(i);
            }
        }

        return stepnums;
    }

    private static boolean isstepnum(int num) {
        int prevDigit = -1;
        while (num > 0) {
            int curDigit = num % 10;
            if (prevDigit != -1) {
                if (Math.abs(prevDigit - curDigit) != 1) {
                    return false;
                }
            }
            num /= 10;
            prevDigit = curDigit;
        }
        return true;
    }

    private static LinkedList<Long> getDigits(long number) {
        LinkedList<Long> stack = new LinkedList<Long>();
        while (number > 0) {
            stack.push(number % 10);
            number = number / 10;
        }

        return stack;
    }

    /*private static List<Integer> getDigits(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number = number / 10;
        }

        return digits;
    }*/

    private static int sum(int[] a) {
        int sum = 0;
        for (int val : a) {
            sum += val;
        }
        return sum;
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int index = -1;
        int N = gas.length;
        if (gas.length > cost.length || gas.length < cost.length) {
            return -1;
        }
        int gasSum = sum(gas);
        int costSum = sum(cost);

        if (gasSum > costSum) {

        } else
            return -1;

        int nGas = 0;
        boolean looped = false;
        for (int i = 0; i < N; i++) {
            nGas += gas[i];

            if (nGas >= cost[i]) {
                nGas -= cost[i];
            } else {
                nGas = 0;
                continue;
            }

            if (i == N - 1 && !looped) {
                looped = true;
                i = -1;
            }
        }

        return index;
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (int val : nums) {
            map.put(val, 0);
        }

        for (int val : nums) {
            map.put(val, map.get(val) + 1);
        }
        int majority = nums.length / 2;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > majority) {
                return entry.getKey();
            }
        }

        return -1;
    }

    //    Given an array of size n, find the majority element.
//    The majority element is the element that appears more than floor(n/2) times.
//    You may assume that the array is non-empty and the majority element always exist in the array.
    public static int majorityElement(final List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : a) {
            map.put(val, 0);
        }

        for (int val : a) {
            map.put(val, map.get(val) + 1);
        }
        int majority = a.size() / 2;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > majority) {
                return entry.getKey();
            }
        }

        return -1;
    }

    // EXCEL1
    // Given a column title as appears in an Excel sheet, return its corresponding column number.
    public static int titleToNumber(String a) {
        int col = 0;
        for (int i = 0; i < a.length(); i++) {
            col = col * 26 + (a.charAt(i) - 'A' + 1);
        }

        return col;
    }

    public static int trailingZeroes(int n) {
        int zeros = 0;
        int multple = 0;
        for (int i = n; i >= 0; i--) {
            if (i % 5 == 0) {
                multple = i;
                break;
            }
        }

        for (int i = 5; i <= multple; i *= 5) {
            zeros += multple / i;
        }
        return zeros;
    }

    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int solution1(int[] A) {
        long n = A.length;
        long sum = 0;      // initialize sum of whole array
        long leftsum = 0; // initialize leftsum

        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i)
            sum += A[i];

        for (int i = 0; i < n; ++i) {
            sum -= A[i]; // sum is now right sum for index i

            if (leftsum == sum)
                return i;

            leftsum += A[i];
        }

        /* If no equilibrium index found, then return 0 */
        return -1;
    }

    public static int lengthOfLastWord(final String a) {
        if (a.isEmpty()) return 0;

        int len = a.length(), lastLength = 0;

        while (len > 0 && a.charAt(len - 1) == ' ') {
            len--;
        }

        while (len > 0 && a.charAt(len - 1) != ' ') {
            lastLength++;
            len--;
        }

        return lastLength;
    }

    int d[][];
    int nA, nB, nC;
    String A, B, C;

    public int isInterleave(int nA, int nB) {
        if (nA + nB == nC) {
            return 1;
        }

        if (d[nA][nB] != -1) {
            return d[nA][nB];
        }

        char a = nA < this.nA ? A.charAt(nA) : '~';
        char b = nB < this.nB ? B.charAt(nB) : '~';
        char c = C.charAt(nA + nB);

        int status = 0;

        if (a == c) {
            status = isInterleave(nA + 1, nB);
        }

        if (b == c) {
            status |= isInterleave(nA, nB + 1);
        }

        return d[nA][nB] = status;
    }

    public int isInterleave(String a, String b, String c) {
        if (a == null || b == null || c == null) {
            return 0;
        }

        nA = a.length();
        nB = b.length();
        nC = c.length();

        if (nA + nB != nC) {
            return 0;
        }

        d = new int[nA + 1][nB + 1];

        for (int i = 0; i <= nA; i++) {
            Arrays.fill(d[i], -1);
        }

        A = a;
        B = b;
        C = c;

        return isInterleave(0, 0);
    }

    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode A) {

        if (A == null)
            return A;

        ListNode next;
        ListNode prevNode;
        int prev = A.val;

        next = A.next;
        prevNode = A;

        while (next != null) {
            if (next.val == prev) {
                prevNode.next = next.next;
            } else {
                prevNode = next;
                prev = next.val;
            }

            next = next.next;
        }

        return A;
        /*
        ListNode head = a;
        while (a.next != null) {
            if (a.val == a.next.val) {
                a.next = a.next.next;
                continue;
            }
            a = a.next;
        }
        return head;
        */
    }

    public static long reverse(long a) {
        long rev = 0;

        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            if ((a & (1 << i)) != 0)
                rev |= 1;
        }

        return rev;
    }

    public static ArrayList<Integer> wave(ArrayList<Integer> a) {
        Collections.sort(a);
        for (int i = 0; i < a.size() - 1; i = i + 2) {
            int j = a.get(i);
            int k = a.get(i + 1);
            if (j < k) {
                int temp = a.get(i);
                a.set(i, a.get(i + 1));
                a.set(i + 1, temp);
            }
        }

        return a;
    }

    /*public static long reverse(long a) {
        long b = 0;
        while (a != 0) {
            b <<= 1;
            b |= (a & 1);
            a >>= 1;
        }
        return b;
    }*/

//    private static LinkedList<Long> getDigits(long number) {
//        LinkedList<Long> stack = new LinkedList<Long>();
//        while (number > 0) {
//            stack.push(number % 10);
//            number = number / 10;
//        }
//
//        return stack;
//    }

    static int getBit(int n, int k) {
        return (n >> k) & 1;
    }

    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int count = 0;
        for (int i = 1; i < X.size(); i++) {
            count += Math.max(Math.abs(X.get(i) - X.get(i - 1)), Math.abs(Y.get(i) - Y.get(i - 1)));
        }

        return count;
    }

    public static boolean isPower(int a) {
        double x = 2;
        double i;
        if (a == 1) return true;
        for (i = 2; (i < 33) && x <= (double) (Math.pow(2, 16)); i++) {
            if (Math.pow(x, i) == (double) (a)) return true;
            if (Math.pow(x, i) >= (Math.pow(2, 32))) {
                i = 1;
                x++;
            }
        }
        return false;
    }

    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 2; i < A; i++) {
            if (isPrime(i) && isPrime(A - i)) {
                arr.add(i);
                arr.add(A - i);
                return arr;
            }
        }
        return arr;
    }

    public boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int isSymmetric(TreeNode a) {
        TreeNode T1 = a.left;
        TreeNode T2 = a.right;

        return rec(T1, T2) ? 1 : 0;
    }

    public static boolean rec(TreeNode node1, TreeNode node2) {

        if (node1 == null && node2 == null)
            return true;

        if (node1 == null || node2 == null)
            return false;

        if (node1.val != node2.val)
            return false;


        return rec(node1.left, node2.right) | rec(node1.right, node2.left);

    }


    private static int bulbs(ArrayList<Integer> a) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (count % 2 != 0) {
                if (a.get(i) == 0) a.set(i, 1);
                else a.set(i, 0);
            }
            if (a.get(i) == 0) {
                // press the switch
                count++;
                a.set(i, 1);
            }
        }
        return count;
    }

    private static int findSingleNum(List<Integer> A) {
        int num = 0;

        for (int val : A) {
            num ^= val;
        }

        return num;
    }

    public static int removeDuplicates(ArrayList<Integer> a) {
        int index = 1;
        int n = a.size();

        if (a == null || a.size() == 0) {
            return 0;
        }

        for (int i = 1; i < n; i++) {
            if (a.get(i).intValue() != a.get(i - 1).intValue()) {
                int temp = a.get(i);
                a.set(index, a.get(i));
                index++;
            }
        }

        System.out.println(a);

        return index;
    }
}