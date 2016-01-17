package Strings;

public class PatternSearching {
    public static void main(String[] args) {
        String s1="stress is bad";
        String s2="is";
        System.out.println(isSubstring(s1,s2));
        System.out.println(patternSearchingNaive(s1,s2));
    }

    public static boolean isSubstring(String s1, String s2) {
        int j=0;
        int i=0;
        while(i<s1.length()) {
            if(s1.charAt(i)==s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
                j=0;
            }
            if(j==s2.length()) {
                return true;
            }
        }
        return false;
    }

    public static int patternSearchingNaive(String string, String pattern) {
        char[] a = string.toCharArray();
        char[] b = pattern.toCharArray();
        int i=0;
        int j=0;
        int count=0;
        while(i<a.length) {
            if(a[i]==b[j]) {
                i++;
                j++;
            } else {
                j=0;
                i++;
            }
            if(j==b.length) {
                return i-b.length;
            }
        }
        return -1;
    }
}
