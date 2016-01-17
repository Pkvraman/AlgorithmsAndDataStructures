package RecursionAndDP;

public class Factorial {
    public static int size = 19;
    public static long[] a = new long[size];
    public static void main(String[] args) {
        System.out.println(fact(size));
    }

    public static long fact(int n) {
        if(n<=2) {
            return n;
        } else if(a[n-1]!=0) {
            return a[n-1];
        } else {
            long val = n*fact(n-1);
            a[n-1]=val;
            return val;
        }
    }

    //Brute force
    public static long fact1(int n) {
        if(n<=2) {
            return n;
        } else {
            return n*fact(n-1);
        }
    }
}
