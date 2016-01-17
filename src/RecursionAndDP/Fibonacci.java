package RecursionAndDP;

public class Fibonacci {
    public static int size = 8;
    public static int[] a = new int[size];

    public static void main(String[] args) {
        int p = fib(size);
        System.out.println(sumOfFib(size, p)); //0 1 1 2 3 5 8 13 21 34
    }

    public static int sumOfFib(int n, int p) {
        int k=p;
        for(int i=n-2;i>=0;i--) {
            k=k+a[i];
        }
        return k;
    }

    private static int fib(int n) {
        if(n<=1) {
            return n;
        } else if(a[n-1] != 0) {
            return a[n-1];
        } else {
            int val = fib(n-1)+fib(n-2);
            a[n-1] =val;
            return val;
        }
    }
}
