package Strings;
public class CompressString {
    public static void main(String[] args) {
        String s = "aabcccccaaa";
        System.out.println(compress(s));
    }

    public static String compress(String s) {
        char[] a = s.toCharArray();
        int count = 1;
        char k = a[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < a.length; i++) {
            if (a[i] == k) {
                count++;
            } else {
                sb.append(k);
                sb.append(count);
                count = 1;
                k = a[i];
            }
        }
        sb.append(k);
        sb.append(count);
        return sb.toString();
    }
}
