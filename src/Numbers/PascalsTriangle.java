package Numbers;

import java.util.Arrays;

public class PascalsTriangle {
    public static void main(String[] args) {
        //1
        //1 1
        //1 2 1
        //1 3 3 1
        //1 4 6 4 1
        System.out.println(Arrays.toString(pascal(6)));
    }

    public static int[] pascal(int n) {
        int[] b = new int[n];
        if(n==1) {
            b[0]=1;
            return b;
        } else if (n==2) {
            b[0]=1;
            b[1]=1;
            return b;
        } else {
            int[] k = pascal(n-1); //1 3 3 1
            for(int i=0;i<n;i++) {
                if(i==0) {
                    b[i]=1;
                } else if(i==n-1) {
                    b[i]=1;
                } else {
                    b[i]=k[i]+k[i-1];
                }
            }
            return b;
        }
    }
}
