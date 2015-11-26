import java.io.*;
import java.util.*;

//2nd smallest number

class Solution {
  public static void main(String[] args) {
    int[] a = {1,7,4,5,6,2,3,9,8,2}; 
    System.out.println(findSecondSmallestNumber(a));    
  }  
  
  private static int findSecondSmallestNumber(int[] a) {
    int l = getSmallestNumber(a);
    int sec = Integer.MAX_VALUE;
    for(int i=0;i<a.length;i++) {
      if(a[i]>l && a[i]<sec) {
        sec=a[i];
      }
    }
    return sec;    
  }
  
  private static int getSmallestNumber(int[] a) {
    int l = Integer.MAX_VALUE;
    for(int i=0;i<a.length;i++) {
      if(a[i]<l) {
        l=a[i];
      }        
    }
    return l;
  }
}

