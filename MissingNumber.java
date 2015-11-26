import java.io.*;
import java.util.*;

//missing number

class Solution {
  public static void main(String[] args) {
    int[] a = {1,4,5,6,2,3,9,8}; 
    System.out.println(findMissingNumber(a));    
  }  
  
  private static int findMissingNumber(int[] a) {
    int l = getLargestNumber(a);
    int mathematicalSum = (l*(l+1))/2;
    int calculatedSum = getSum(a);
    return (mathematicalSum-calculatedSum);    
  }
  
  private static int getLargestNumber(int[] a) {
    int l = -1;
    for(int i=1;i<a.length;i++) {
      if(a[i]>l) {
        l=a[i];
      }        
    }
    return l;
  }
  
  private static int getSum(int[] a) {
    int sum = 0;
    for(int i=0;i<a.length;i++) {
      sum = sum+a[i];
    }
    return sum;
  }
}

