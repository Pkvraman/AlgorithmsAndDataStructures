import java.io.*;
import java.util.*;

//string indexOf

class Solution {
  public static void main(String[] args) {
    String s= "My name is praveen";
    System.out.println(indexOf(s,"praveen"));
  }  
  
  
 private static int indexOf(String string, String substring) {
   int count=0;
   for(int i=0;i<string.length();i++) {
     if(string.charAt(i)==substring.charAt(count)) {
       count++;
     } else {
       count =0;
     }
     if(count==substring.length()) {
       return i+1-substring.length();
     }
   }
   return -1;         
   }
}
