package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

class BasicArrayOperations {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 6, 2, 3, 9, 8};
        System.out.println(findMissingNumber(a));
        System.out.println(findGreatestElement(a));
        System.out.println(findLeastElement(a));
        System.out.println(Arrays.toString(reverse(a)));
        System.out.println(Arrays.toString(reverseOptimized(a)));
        System.out.println(findSecondSmallestNumber(a));
        System.out.println(getIntegerwithLeastCount(a));
        System.out.println(Arrays.toString(diff(a)));
    }

    private static int findMissingNumber(int[] a) {
        int l = getLargestNumber(a);
        int mathematicalSum = (l * (l + 1)) / 2;
        int calculatedSum = getSum(a);
        return (mathematicalSum - calculatedSum);
    }

    private static int getLargestNumber(int[] a) {
        int l = -1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > l) {
                l = a[i];
            }
        }
        return l;
    }

    private static int getSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    private static int findGreatestElement(int[] a) {
        int maxValue = Integer.MIN_VALUE;
        for (int k : a) {
            if (k > maxValue) {
                maxValue = k;
            }
        }
        return maxValue;
    }

    private static int findLeastElement(int[] a) {
        int minValue = Integer.MAX_VALUE;
        for (int k : a) {
            if (k < minValue) {
                minValue = k;
            }
        }
        return minValue;
    }

    private static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[j] = a[i];
            j++;
        }
        return b;
    }

    private static int[] reverseOptimized(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }
        return a;
    }


    private static int findSecondSmallestNumber(int[] a) {
        int l = getSmallestNumber(a);
        int sec = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > l && a[i] < sec) {
                sec = a[i];
            }
        }
        return sec;
    }

    private static int getSmallestNumber(int[] a) {
        int l = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < l) {
                l = a[i];
            }
        }
        return l;
    }

    private static ArrayList<Integer> getIntegerwithLeastCount(int[] a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int minCount = 1;
        if (a.length == 0) {
            list.add(-1);
            return list;
        }
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (hashmap.containsKey(a[i])) {
                hashmap.put(a[i], hashmap.get(a[i]) + 1);
            } else {
                hashmap.put(a[i], 1);
            }
        }
        Set<Integer> keyset = hashmap.keySet();
        for (Integer key : keyset) {
            if (hashmap.get(key) <= minCount) {
                minCount = hashmap.get(key);
                list.add(key);
            }
        }
        return list;
    }

    private static int[] diff(int[] a) {
        int k = a[0];
        int[] newarray = new int[a.length];
        for (int i = 1; i < a.length; i++) {
            newarray[i - 1] = a[i] - k;
            k = a[i];
        }
        return newarray;
    }
}

