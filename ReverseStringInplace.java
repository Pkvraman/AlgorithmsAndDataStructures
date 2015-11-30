import java.io.*;
import java.util.*;

//reverse string in place

class Solution {
  public static void main(String[] args) {
    String s = "abc def  efg";
    System.out.println(reverse(s));
  }

 private static String reverse(String s) {
   String[] a = s.split(" ");
   for(int i=0;i<a.length/2;i++) {
     String tmp = a[i];
     a[i] = a[a.length-i-1];
     a[a.length-i-1] = tmp;
   }
    return String.join(" ",a); 
   
   }
   
}

