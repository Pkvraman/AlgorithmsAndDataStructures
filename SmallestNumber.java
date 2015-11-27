import java.io.*;
import java.util.*;

//smallest emelemt

class Solution {
  public static void main(String[] args) {
    int[] a = {1,2,3,-100,4,5,6,-10,10,7,1}; 
    System.out.println(findGreatestElement(a));
    System.out.println(findLeastElement(a)); 
    System.out.println(Arrays.toString(reverse(a)));
    System.out.println(Arrays.toString(reverseOptimized(a)));

  }  
  
  private static int findGreatestElement(int[] a) {
    int maxValue = Integer.MIN_VALUE;
    for(int k:a) {
      if(k>maxValue) {
        maxValue=k;
      }
    }
    return maxValue;    
  }
  
  private static int findLeastElement(int[] a) {
    int minValue = Integer.MAX_VALUE;
    for(int k:a) {
      if(k<minValue) {
        minValue = k;
      }
    }
    return minValue;
  }
  
  private static int[] reverse(int[] a) {
    int[] b = new int[a.length];
    int j=0;
    for(int i=a.length-1;i>=0;i--) {
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
}

