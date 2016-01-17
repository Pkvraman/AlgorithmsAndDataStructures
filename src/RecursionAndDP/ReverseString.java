package RecursionAndDP;

public class ReverseString {
    public static void main(String[] args) {
        String s="stress is bad";
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        if(s.length()==0) {
            return "";
        }
        return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
    }
}
