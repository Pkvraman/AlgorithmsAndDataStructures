package TwoDArray;

public class Linear2DSearch {
    public static void main(String[] args) {
        int[][] a=new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,15,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(search(a,22,5,5));
    }

    public static boolean search(int[][] a, int k, int n, int m) {
        int i=0;
        int j=m-1;
        while(i<n && j>=0) {
            if(a[i][j]==k) {
                return true;
            } else if(k<a[i][j]){
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
