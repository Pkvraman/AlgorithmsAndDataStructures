package Strings;
public class CompressString {
    public static void main(String[] args) {
        String s = "aabcccccaaa";
        System.out.println(compress(s));
        System.out.println(compressionSize(s));
        System.out.println(compressEfficient(s));
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

    //more efficient method
    public static String compressEfficient(String str) {
        char firstChar = str.charAt(0);
        int count =1;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<str.length();i++) {
            if(str.charAt(i)==firstChar) {
                count++;
            } else {
                sb.append(firstChar);
                sb.append(count);
                firstChar=str.charAt(i);
                count=1;
            }
        }
        sb.append(firstChar);
        sb.append(count);
        return sb.toString();
    }

    private static int compressionSize(String str) {
        char firstChar = str.charAt(0);
        int count =1;
        for(int i=1;i<str.length();i++) {
            if(str.charAt(i)!=firstChar) {
                count++;
                firstChar=str.charAt(i);
            }
        }
        return 2*count;
    }
}
