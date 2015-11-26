//write a function that takes an array of ints and returns the int that appears the least amount of times

import java.io.*;
import java.util.*;

//write a function that takes an array of ints and returns the int that appears the least amount of times

class Solution {
  public static void main(String[] args) {
    int[] a = {1,2,3,1,1,2,5,5,4,4,4,4,0,0,0,0,10}; 
    System.out.println(getIntegerwithLeastCount(a));
    
  }  
  
  private static ArrayList<Integer> getIntegerwithLeastCount(int[] a) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int minCount = 1;
    if(a.length==0) {
      list.add(-1);
      return list;
    }
    HashMap<Integer,Integer> hashmap = new HashMap<Integer, Integer>();
    for(int i=0;i<a.length;i++) {
      if(hashmap.containsKey(a[i])) {
      hashmap.put(a[i],hashmap.get(a[i])+1);
    } else {
        hashmap.put(a[i],1);
      }
    }    
    Set<Integer> keyset = hashmap.keySet();
    for(Integer key:keyset) {
      if (hashmap.get(key)<=minCount) {
        minCount = hashmap.get(key);
        list.add(key); 
      }
    }    
    return list;
    
}
}

