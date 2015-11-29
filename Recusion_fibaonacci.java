import java.io.*;
import java.util.*;

//fibonacci

class Solution {
  public static void main(String[] args) {
    System.out.println(fib(40));
  }  
  
  
 private static int fib(int n) {  
  int[] results = new int[n+1];
    results[1] = 1;
    results[2] = 1;
    for (int i = 3; i <= n; i++) {
        results[i] = results[i-1] + results[i-2];
    }
    return results[n];
 }

}
