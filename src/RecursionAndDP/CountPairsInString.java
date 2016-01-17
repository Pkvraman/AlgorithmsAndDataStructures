package RecursionAndDP;

public class CountPairsInString {
    public static void main(String[] args) {
        String s = "xxx";
        System.out.println(getCountOfPairs(s));
    }

    public static int getCountOfPairs(String s) {
        if(s.length()<3) {
            return 0;
        } else {
            return getCount(s.substring(0,3)) + getCountOfPairs(s.substring(1));
        }
    }

    private static int getCount(String s) {
        if(s.charAt(0)==s.charAt(2)) {
            return 1;
        }
        return 0;
    }
}
