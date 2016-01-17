package Arrays;

import java.util.HashMap;
import java.util.Set;

public class OddOccurance {
    public static void main(String[] args) {
        int[] a = {1,2,2,2,1,5,5,0,0,6,6,6,6};
        System.out.println(oddOccurance(a));
    }

    public static Integer oddOccurance(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<a.length;i++) {
            if(map.containsKey(a[i])) {
                map.remove(a[i]);
            } else {
                map.put(a[i],1);
            }
        }
        Set<Integer> keyset = map.keySet();
        for(Integer key:keyset) {
            if(map.get(key)!=null) {
                return key;
            }
        }
        return -1;
    }
}
