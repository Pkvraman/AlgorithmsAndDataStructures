package Strings;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "aabcdc+# ";
        String s2 = "xxzefeNm ";
        System.out.println(isIsomorphic1(s1,s2));
        System.out.println(isIsomorphic2(s1,s2));
    }

    public static boolean isIsomorphic1(String s1, String s2) {
        if(s1.length()!= s2.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i=0;i<s1.length();i++) {
            if(!map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i),s2.charAt(i));
            }
        }
        //a->x; b->y
        for(int i=0;i<s1.length();i++) {
            if(map.get(s1.charAt(i))!=s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIsomorphic2(String s1, String s2) {
        boolean[] arr =  new boolean[128];
        int[] a = new int[128];
        if(s1.length()!= s2.length()) {
            return false;
        }
        for(int i=0;i<s1.length();i++) {
            if(!arr[s1.charAt(i)]) {
                a[s1.charAt(i)]=s2.charAt(i);
                arr[s1.charAt(i)]=true;
            }
        }
        for(int i=0;i<s2.length();i++) {
            if(!isfound(s2.charAt(i),a)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isfound(char c, int[] a) {
        for(int i=0;i<a.length;i++) {
            if(a[i]==c) {
                return true;
            }
        }
        return false;
    }
}
