package Arrays;

import java.util.Arrays;

public class RearrangeNumbers {
    public static void main(String[] args) {
        int[] a={-3,1,5,7,-4,-7,-6}; //{-3,1,-4,5,-7,7,-6}
        System.out.println(Arrays.toString(rearrange(a)));
    }

    public static int[] rearrange(int[] a) {
        int i=0;
        int j=a.length-1;
        while(i<=j) {
            while(i%2==0 && a[i]<0) {
                i++;
            }
            while (j%2!=0 && a[j]>=0) {
                j--;
            }
            if(i%2==0 && a[i]>0) {
                if(j%2!=0 && a[j]<=0) {
                    swap(i,j,a);
                    i++;
                    j--;
                } else if(j%2!=0 && a[j]>=0) {
                    j--;
                } else if(j%2==0 && a[j]<0) {
                    j--;
                }
            } else {
                i++;
            }
        }
        return a;
    }
    private static void swap(int i, int j, int[] a) {
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
}
