package TwoDArray;

public class Diagonal2DSearch {
    public static void main(String[] args) {
        int[][] a=new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,15,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(search(a,12,5,5));
    }

    public static boolean search(int[][] a, int k, int n, int m) {
        int i=0;
        int j=m-1;
        while(i<n && j>=0) {
            if(k<a[i][j]) {
                if(binarySearch(a[i],k)) {
                    return true;
                }
            } else {
                int[] col=getColumn(j,a);
                if(binarySearch(col,k)) {
                    return true;
                }
            }
            i++;
            j--;
        }
        return false;
    }

    private static int[] getColumn(int j, int[][] a) {
        int[] col=new int[a.length];
        for(int i=0;i<a.length;i++) {
            col[i]=a[i][j];
        }
        return col;
    }

    private static boolean binarySearch(int[] a, int k) {
        int i=0;
        int j=a.length-1;
        int mid=(i+j)/2;
        while(i<=j) {
            if(k==a[mid]) {
                return true;
            } else if(k<a[mid]) {
                j=mid-1;
            } else {
                i=mid+1;
            }
            mid=(i+j)/2;
        }
        return false;
    }
}
