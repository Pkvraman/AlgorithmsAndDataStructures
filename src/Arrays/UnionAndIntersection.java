package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] a={100,6,7,10,11};
        int[] b={78,35,22,10,34,14,34,21,77};
        System.out.println(Arrays.toString(union(a,b)));
        System.out.println(Arrays.toString(sortAndMerge(a,b)));
        System.out.println(intersection(a,b));
    }

    public static int[] union(int[] a, int[] b) {
        int[] r= new int[a.length+b.length];
        int count=0;
        int i=0; int j=0;
        while(i<a.length) {
            r[count]=a[i];
            i++;
            count++;
        }
        while(j<b.length) {
            r[count]=b[j];
            count++;
            j++;
        }
        return r;
    }

    public static int[] sortAndMerge(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int[] r= new int[a.length+b.length];
        int count=0;
        int i=0; int j=0;
        while(i<a.length && j<b.length) {
            if(a[i]<b[j]) {
                r[count]=a[i];
                i++;
            } else if(a[i]>=b[j]) {
                r[count]=b[j];
                j++;
            }
            count++;
        }
        while(j<b.length) {
            r[count]=b[j];
            count++;
            j++;
        }
        while(i<a.length) {
            r[count]=a[i];
            count++;
            i++;
        }
        return r;
    }

    public static int intersection(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<a.length;i++) {
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++) {
            if(set.contains(b[i])) {
                return b[i];
            }
        }
        return -1;
    }
}
