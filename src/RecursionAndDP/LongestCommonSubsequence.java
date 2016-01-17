package RecursionAndDP;

public class LongestCommonSubsequence {
    public static String s1="AGGTAB";
    public static String s2="GXTXAYB";//GTAB
    public static int[][] a= new int[s1.length()][s2.length()];
    public static void main(String[] args) {
        System.out.println(longestSubsequence(0, 0));
    }

    public static int longestSubsequence(int i, int j) {
        if(s1.equals(s2)) {
            return s1.length();
        } else if (i==s1.length() || j==s2.length()) {
            return 0;
        } else if (s1 == null && s2 == null) {
            return -1;
        } else if (a[i][j] != 0) {
            return a[i][j];
        } else {
            if (s1.charAt(i)==s2.charAt(j)) {
                a[i][j]=1+longestSubsequence(i+1, j+1);
            } else {
                a[i][j] = Math.max(longestSubsequence(i+1, j), longestSubsequence(i, j+1));
            }
        }
        return a[i][j];
    }
}
