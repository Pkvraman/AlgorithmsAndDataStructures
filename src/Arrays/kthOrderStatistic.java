package Arrays;

import java.util.Arrays;

public class kthOrderStatistic {

    public static void main(String[] args) {
        int[] a={100,6,7,10,11,78,35,22,34,14, 34,21,77};
        System.out.println(findMedianByOrderStatistic(a,a.length/2,0,a.length-1)); //n
        System.out.println(findMedianByLinearSearch(a)); //nlogn
    }

    public static int findMedianByLinearSearch(int[] a) {
        if(a==null || a.length==0) {
            return -100;
        } else {
            Arrays.sort(a);
            return a[a.length/2];
        }
    }

    public static int findMedianByOrderStatistic(int[] a, int stat, int i, int j) {
        int pivotPosition = partition(a, i, j);
        if (pivotPosition == stat) {
            return a[stat];
        } else if (stat - 1 < pivotPosition) {
            return findMedianByOrderStatistic(a, stat, i, pivotPosition - 1);
        } else {
            return findMedianByOrderStatistic(a, (pivotPosition-stat), pivotPosition + 1, j);
        }
    }

    public static int partition(int[] a, int i, int j) {
        int pivot = a[i];
        int pivotPos=i;
        while (i <= j) {
            while (i<=j && a[i] <=pivot) {
                i++;
            }
            while (i<=j && a[j] > pivot) {
                j--;
            }
            if(i<=j) {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        swap(a,pivotPos,j);
        return i-1;
    }

    private static void swap(int[] a, int i, int j) {
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
}
