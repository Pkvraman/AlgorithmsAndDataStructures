package Strings;

public class IsStringRotated {
    public static void main(String[] args) {
        String s1="waterbottle";
        String s2="tlewaterbot";
        System.out.println(isRotation(s1,s2));
    }

    public static boolean isRotation(String s1, String s2) {
        String s = s2+s2;
        return isSubstring(s1,s);
    }

    private static boolean isSubstring(String s2, String s1) {
        if(s2.length()>s1.length()) {
            return false;
        }
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
}
