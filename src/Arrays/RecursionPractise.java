package Arrays;

public class RecursionPractise {
    public static void main(String[] args) {
        // int result = print(16);
        int[] a = {1, 2, 3};
        System.out.println(greatest(a));
        System.out.println(sum(a, a.length - 1));
        int e = 2;
        System.out.println(exp(e, 6));
    }

    private static int print(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.println(n);
        int next = print(n - 1);
        return next;
    }

    private static int greatest(int[] a) {
        return greatest(a, a.length - 1);
    }

    private static int greatest(int[] a, int index) {
        if (index == 0) {
            return a[index];
        } else {
            int nextGreatest = greatest(a, index - 1);
            int max = Math.max(a[index], nextGreatest);
            return max;
        }
    }

    private static int sum(int[] a, int index) {
        if (index == 0) {
            return a[index];
        }
        int sumPrev = sum(a, index - 1);
        return sumPrev + a[index];
    }

    private static int exp(int a, int k) {
        if (k == 0) {
            return 1;
        }
        int expPrev = exp(a, k - 1);
        return a * expPrev;
    }

    private static int fib(int n) {
        int[] results = new int[n + 1];
        results[1] = 1;
        results[2] = 1;
        for (int i = 3; i <= n; i++) {
            results[i] = results[i - 1] + results[i - 2];
        }
        return results[n];
    }
}
