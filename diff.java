import java.io.*;
import java.util.*;

class Solution {
    
  public static void main(String[] args) {
    int[] a = {1,2,5,7,3}; 
    for(int j=0;j<a.length-1;j++) {
    System.out.println(diff(a)[j]);
    }
  }
  
  private static int[] diff(int[] a) {
    int k=a[0];
    int[] newarray = new int[a.length];
    for(int i=1;i<a.length;i++) {
      newarray[i-1] = a[i]-k;
      k=a[i];      
    }
    return newarray;
  }
}
