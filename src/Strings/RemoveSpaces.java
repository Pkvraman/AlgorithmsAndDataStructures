package Strings;

public class RemoveSpaces {
    public static void main(String[] args) {
        String s="abcd efgh    ijk  ";
        System.out.println(removeSpaces(s));
    }

    public static char[] removeSpaces(String s) {
        int count = 0;
        char[] a= new char[s.length()];
        int i=0;
        while(i<s.length()) {
            if(s.charAt(i)!=' ') {
                a[count]=s.charAt(i);
                count++;
            }
            i++;
        }
        return a;
    }
}
