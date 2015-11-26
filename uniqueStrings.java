import java.io.*;
import java.util.*;

//write a function that takes a sentence and returns the unique words

class Solution {
  public static void main(String[] args) {
    String s = "this      is a very very hot hot hot day"; 
    System.out.println(getUniqueStringsinList(s));    
  }  
  
  private static ArrayList<String> getUniqueStringsinList(String s) {
    ArrayList<String> list = new ArrayList<String>();
    if(s.equals("")) {
      list.add("");
      return list;
    } 
    
    String[] stringArray = s.split("\\s+");
    System.out.println(Arrays.toString(stringArray));
    HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
    for(String st:stringArray) {
      if(hashmap.containsKey(st)) {
        hashmap.put(st,hashmap.get(st)+1);
      } else {
        hashmap.put(st,1);
      }
    }
    
    System.out.println(hashmap);
    Set<String> keyset = hashmap.keySet();
    for(String key:keyset) {
      if(hashmap.get(key)==1) {
        list.add(key);
      }
    }
    
    return list;
}
}

