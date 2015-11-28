import java.io.*;
import java.util.*;

//string contains

class Solution {
  public static void main(String[] args) {
    String s= "My name is praveen";
    System.out.println(isSubString(s,"praveen"));
  }  
  
  
 private static boolean isSubString(String main, String Substring) {
    boolean flag=false;
    if(main==null && main.trim().equals("")){
        return flag;
    }
    if(Substring==null){
        return flag;
    }

    char fullstring[]=main.toCharArray();
    char sub[]=Substring.toCharArray();
    int counter=0;

    for(int i=0;i<fullstring.length;i++){
        if(fullstring[i]==sub[counter]){
            counter++;
        }else{
            counter=0;
        }

        if(counter==sub.length){
        flag=true;
        return flag;
        }
    }
    return flag;
}
}
