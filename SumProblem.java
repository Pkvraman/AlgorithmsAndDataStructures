import java.io.*;
import java.util.*;

//sum of 2 numbers

class Solution {
  public static void main(String[] args) {
    int[] a = {5,1,6,10,2,3,7}; 
    System.out.println(findDoubles(a));
  }  
  
  
  private static HashSet<HashSet<Integer>> findDoubles(int[] a) {
        HashSet<HashSet<Integer>> masterList = new HashSet<HashSet<Integer>>();
    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
    for(int k:a) {
      if(map.containsKey(k)) {
      map.put(k,map.get(k)+1);
      } else {
        map.put(k,1);
      }
    }
          int sum = 0;
    for(int j=0;j<a.length;j++) {
             HashSet<Integer> set = new HashSet<Integer>();
    for(int i=j;i<a.length;i++) {
      if(map.containsKey(sum-a[i]) && (sum-a[i]!=a[i])) { 
        set.add(a[i]);
        set.add(sum-a[i]);
        set.add(sum);
      }
    }
    sum = a[j];
    masterList.add(set);
      
  }
    return masterList;
}
  
}
