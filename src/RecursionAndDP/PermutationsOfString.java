package RecursionAndDP;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {
    public static void main(String[] args) {
    String s="abc";
    System.out.println(permutations(s));
}

    public static List<String> permutations(String s) {
        List<String> list = new ArrayList<String>();
        if(s.length()==0) {
            list.add("");
            return list;
        }
        String c=s.substring(0,1);
        List<String> perm = permutations(s.substring(1));
        for(String word:perm) {
            for(int pos=0;pos<=word.length();pos++) {
                String insertedWord = insert(c,word,pos);
                list.add(insertedWord);
            }
        }
        return list;
    }

    private static String insert(String c, String word, int pos) {
        String start = word.substring(0,pos);
        String end = word.substring(pos);
        return start+c+end;
    }
}
