package Arrays;

public class FindChangePointInArray {
    public static void main(String[] args) {
        int[] a={0,1,5,10,15,83,74,8,7,6,3,2,-1}; //83
        System.out.println(findChangePointByLinearSearch(a));
        System.out.println(findChangePointByBinarySearch(a));
    }

    public static int findChangePointByLinearSearch(int[] a) {
        if(a==null || a.length==0) {
            return -100;
        } else {
            for(int i=1;i<a.length-1;i++) {
                if(a[i]>a[i-1] && a[i]>a[i+1])
                    return a[i];
            }
            return -200;
        }
    }

    public static int findChangePointByBinarySearch(int[] a) {
        int low=0;
        int high=a.length-1;
        int mid=(low+high)/2;
        while(low<=high) {
            if(a[mid]>a[mid-1] && a[mid]>a[mid+1]) {
                return a[mid];
            } else if(a[mid]>a[mid+1] && a[mid]<a[mid-1]) {
                high=mid-1;
            } else if(a[mid]>a[mid-1] && a[mid]<a[mid+1]) {
                low=mid+1;
            }
            mid=(low+high)/2;
        }
        return -200;
    }
}
