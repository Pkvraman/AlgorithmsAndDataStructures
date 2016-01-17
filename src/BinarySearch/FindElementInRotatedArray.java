package BinarySearch;

public class FindElementInRotatedArray {
    public static void main(String[] args) {
        int[] a = {5,6,7,1,3,4};
        System.out.println(find(a,6));
    }

    public static Integer find(int[] a, int k) {
        int low=0;
        int high=a.length-1;
        int mid=(low+high)/2;
        while(low<=high) {
            if(a[mid]==k) {
                return mid;
            } else if(a[mid]<k) {
                if(k<=a[high]) {
                    low=mid+1;
                } else {
                    high=mid-1;
                }
            } else {
                if(k>=a[low]) {
                    high=mid-1;
                } else {
                    low=mid+1;
                }
            }
            mid=(low+high)/2;
        }
        return -1;
    }
}
