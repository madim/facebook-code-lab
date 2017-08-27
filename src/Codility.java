import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by madi on 6/1/17.
 */
public class Codility {

    private boolean check(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) return false;
        }
        return true;
    }

    public boolean solution1(int[] A) {
        // write your code in Java SE 8
        if (check(A)) return true;
        int[] B = A.clone();
        int[] C = A.clone();
        int id1 = -1, id2 = -1, tmp = -1;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                id1 = i;
                id2 = i + 1;
                break;
            }
        }

        tmp = A[id1];
        A[id1] = A[id2];
        A[id2] = tmp;

        if (check(A)) return true;

        for (int i = id1 - 1; i >= 0; i--) {
            if ((i == 0 || B[i - 1] <= B[id2]) && B[id2] <= B[i + 1]) {
                tmp = B[id2];
                B[id2] = B[i];
                B[i] = tmp;
                break;
            }
        }

        if (check(B)) return true;

        for (int i = id2 + 1; i < C.length; i++) {
            if (C[i - 1] <= C[id1] && (i + 1 == C.length || C[id1] <= C[i + 1])) {
                tmp = C[id1];
                C[id1] = C[i];
                C[i] = tmp;
            }
        }

        if (check(C)) return true;

        return false;
    }

    class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }

    private int ans = 0;

    public void solve(Tree T, char prev, int cnt) {
        if (T == null) return;
        ans = Math.max(ans, cnt);
        if (prev == 'L') {
            solve(T.l, 'L', cnt);
            solve(T.r, 'R', cnt + 1);
        } else if (prev == 'R') {
            solve(T.l, 'L', cnt + 1);
            solve(T.r, 'R', cnt);
        }
    }

    public int solution2(Tree T) {
        // write your code in Java SE 8
        if (T == null) return 0;

        solve(T.l, 'L', 0);
        solve(T.r, 'R', 0);

        return ans;
    }

    public static int solution3(int[] A, int D) {
        // write your code in Java SE 8
        if (D > A.length) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++)
            if (A[i] != -1) map.put(A[i], i);

        Arrays.sort(A);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(A.length);
        for (int i = 0; i < A.length; i++) {
            if (A[i] == -1) continue;
            list.add(map.get(A[i]));
            Collections.sort(list);
            boolean bool = false;
            for (int j = 0; j < list.size() - 1; j++) {
                int a = list.get(j + 1);
                int b = list.get(j);
                if (a - b > D) {
                    bool = true;
                    break;
                }
            }
            if (!bool) return A[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.print(solution3(nums, 1));
    }
}
