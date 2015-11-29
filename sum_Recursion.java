import java.io.*;
import java.util.*;

//sum of n numbers using recursion

class Solution {
  public static void main(String[] args) {
    int[] a = {1,2,3,4,5,6};
    System.out.println(sum(a,5));
  }  
    
 private static int sum(int[] a, int n) {  
  //sum(a[n]) = sum(a[n-1])+a[n]
   if(n==0) {
     return a[0];
   }
   return sum(a,n-1)+a[n];
 }
}
