package Numbers;

public class IsNumberSorted {
    public static void main(String[] args) {
        int a=123560;
        System.out.println(isSorted(a));
        System.out.println(isSortedRec(a));
    }

    public static boolean isSorted(int a) {
        int k=a%10;
        a=a/10;
        while(a!=0) {
            if(a%10>k) {
                return false;
            }
            k=a%10;
            a=a/10;
        }
        return true;
    }

    public static boolean isSortedRec(int a){
        if(a==0) {
            return true;
        }
        int k=a%10;
        a=a/10;
        if(a%10>k) {
            return false;
        } else {
            return isSortedRec(a);
        }
    }
}
