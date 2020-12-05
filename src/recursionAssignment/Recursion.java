package recursionAssignment;
import java.io.*;


public class Recursion{
 public static int count7(int n){
   // Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
   
   if (n == 0){
     return 0;
   } else if (n % 10 == 7){
     return 1 + count7(n / 10);
   }
    return count7(n / 10);
 }

 public static String pairStar(String str){
   // Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
    // base case
   if(str.substring(1).equals("")){
     return str.substring(0);
     // recursive case
   }else if (str.substring(0,1).equals(str.substring(1,2))){
     return str.substring(0,1) + "*" + pairStar(str.substring(1));
   }else{
     return str.substring(0,1) + pairStar(str.substring(1));
   }
 }
 public static String stringClean(String str){
   // Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".

   // Base Case
   if(str.substring(0).equals("")){
     return str.substring(0);
   }else if (str.substring(1).equals("")){
     return str.substring(0);
   }else if(!str.substring(2).equals("")){
     if(str.charAt(0) == str.charAt(1) && str.charAt(0) == str.charAt(2)){
       return str.charAt(0) + stringClean(str.substring(3));
     }else if(str.charAt(0) == str.charAt(1)){
       return str.charAt(1) + stringClean(str.substring(2));
     }else{
       return str.charAt(0) + stringClean(str.substring(1));
     }
    // Recursive Case
   }else if(str.charAt(0) == str.charAt(1)){
     return str.charAt(1) + stringClean(str.substring(2));
   }else{
    return str.charAt(0) + stringClean(str.substring(1));
   }
 }
}
