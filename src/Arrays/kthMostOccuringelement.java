package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class kthMostOccuringelement {
    public static void main(String[] args) {
        int[] a = {3,3,6,3,3,1,1,2,6,5,5,5,6,6,6};
        System.out.println(kMostOccuringElement2(a,1));
    }

    public static class Value implements Comparable<Value>{
        public int val;
        public int count;

        @Override
        public int compareTo(Value other) {
            return other.count-this.count;
        }
    }

    public static int kMostOccuringElement1(int[] a, int k) {
        Map<Integer, Value> map = buildMap(a);
        Value ans=null;
        PriorityQueue<Value> q = new PriorityQueue<Value>();
        Set<Integer> set = map.keySet();
        for(Integer key:set) {
            q.offer(map.get(key));
        }
        for(int i=0;i<k;i++) {
            ans=q.poll();
        }
        return ans.val;
    }

    public static Integer kMostOccuringElement2(int[] a, int k) {
        Map<Integer, Value> map = buildMap(a);
        Set<Integer> set = map.keySet();
        int kthValue = 5;
        for(Integer key:set) {
            if(map.get(key).count==kthValue) {
                return key;
            }
        }
        return null;
    }

    private static Map<Integer, Value> buildMap(int[] a) {
        HashMap<Integer, Value> map = new HashMap<Integer, Value>();
        for(int i=0;i<a.length;i++) {
            Value value = new Value();
            if(map.containsKey(a[i])) {
                value.val=a[i];
                value.count=map.get(a[i]).count+1;
                map.put(a[i],value);
            } else {
                value.val=a[i];
                value.count=1;
                map.put(a[i],value);
            }
        }
        return map;
    }
}
