package Numbers;

import java.util.Arrays;

public class NextGreatestNumber {
    public static void main(String[] args) {
        int[] a={5,3,4,9,7,6};
        System.out.println(Arrays.toString(nextGreatest(a)));
    }

    public static int[] nextGreatest(int[] a) {
        int i=0;
        int j=a.length-1;
        int index=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(j>=0) {
            if(a[j]>max) {
                max=a[j];
                if(a[j]<min) {
                    min=a[j];
                    index=j;
                }
            } else {
                swap(a,index,j);
                break;
            }
            j--;
        }
        rotate(a,j+1,a.length-1);
        return a;
    }

    private static void swap(int[] a, int i, int j) {
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }

    private static void rotate(int[] a, int i, int j) {
        while(i<=j) {
            swap(a,i,j);
            i++;
            j--;
        }
    }
}
