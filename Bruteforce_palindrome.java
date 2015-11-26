import java.io.*;
import java.util.*;

//palindrome

class Solution {
  public static void main(String[] args) {
    String s = "malayalam"; 
    System.out.println(isPalindrome(s));    
  }  
  
  private static boolean isPalindrome(String s) {
    String reversedString = reversedString(s);
    System.out.println(reversedString);
    if(s.equals(reversedString)) {
      return true;
    }
    return false;
}
  
  private static String reversedString(String s) {
    int j = 0;
    char[] st = new char[s.length()];
    for(int i=s.length()-1;i>=0;i--) {
      st[j]=s.charAt(i);
      j++;      
    }
    return String.valueOf(st);
  }
}

