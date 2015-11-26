import java.io.*;
import java.util.*;

// for a given string, implement a utilities class such that it reverses a sentence
// for example: "I  am a tea pot "
// output: " pot tea a am  I"
// StringUtilsExt.reverse("I  am   a tea pot ");

class ReverseString {
  public static void main(String[] args) {
    String s="I  am a       tea     pot "; 
    System.out.println(reverse(s));
    
  }  
  
  private static String reverse(String s) {
    String[] wordArray = s.split(" ");
    System.out.println(wordArray[wordArray.length-1]);
    StringBuffer sb = new StringBuffer();    
    for(int i=wordArray.length-1;i>=0;i--) {
    sb.append(wordArray[i]+" ");
}
      return sb.toString();
  }    
}

