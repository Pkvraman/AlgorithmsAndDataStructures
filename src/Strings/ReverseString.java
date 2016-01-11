package Strings;

// for a given string, implement a utilities class such that it reverses a sentence
// for example: "I  am a tea pot "
// output: " pot tea a am  I"
// StringUtilsExt.reverse("I  am   a tea pot ");

class ReverseString {
    public static void main(String[] args) {
        String s = "I  am a       tea     pot ";
        System.out.println(reverse(s));

    }

    private static String reverse(String s) {
        String[] wordArray = s.split(" ");
        System.out.println(wordArray[wordArray.length - 1]);
        StringBuffer sb = new StringBuffer();
        for (int i = wordArray.length - 1; i >= 0; i--) {
            sb.append(wordArray[i] + " ");
        }
        return sb.toString();
    }

    private static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char[] a = new char[s.length()];
            int j = 0;
            while (i < s.length() && s.charAt(i) != ' ') {
                a[j] = s.charAt(i);
                j++;
                i++;
            }
            i = i + 1;
            char[] b = reverse(a);
            sb.append(b);
            sb.append(" ");
        }
        return sb.toString();
    }

    private static char[] reverse(char[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            char tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }
        return a;
    }
}    


