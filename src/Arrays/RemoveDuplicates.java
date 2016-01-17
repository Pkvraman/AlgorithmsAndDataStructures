package Arrays;
import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,3,3,3,4,5,5,5};
        System.out.println(Arrays.toString(removeDuplicates1(a)));
        System.out.println(Arrays.toString(removeDuplicates2(a)));
    }

    public static int[] removeDuplicates1(int[] a) {
        int count=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<a.length;i++) {
            if(!set.contains(a[i])) {
                set.add(a[i]);
                a[count]=a[i];
                count++;
            }
        }
        for(int i=count;i<a.length;i++) {
            a[count]=0;
            count++;
        }
        return a;
    }

    public static int[] removeDuplicates2(int[] a) {
        int i=0;
        int j=1;
        int count=0;
        while(i<a.length && j<a.length) {
            if(a[i]==a[j]) {
                j++;
            } else {
                a[count]=a[i];
                count++;
                i=j;
                j++;
            }
        }
        return a;
    }
}
