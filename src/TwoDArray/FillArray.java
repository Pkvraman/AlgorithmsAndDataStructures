package TwoDArray;

public class FillArray {
    public static void main(String[] args) {
        int[][] a=new int[][] { {1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 0}};
        fill(a);
        for(int i=0; i < a.length; i++){
            for(int j=0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fill(int[][] a) {
        int[] row = new int[a.length];
        int[] column = new int[a[0].length];
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                if(a[i][j]==1) {
                    row[i]=1;
                    column[j]=1;
                }
            }
        }
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                if(row[i]==1 || column[j]==1) {
                    a[i][j]=1;
                }
            }
        }
    }
}
