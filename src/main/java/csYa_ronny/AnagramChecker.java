package csYa_ronny;

import javax.swing.*;
import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
       char[]arr=str1.toCharArray();
       char[]arr1=str2.toCharArray();
      Arrays.sort(arr);
      Arrays.sort(arr1);
      if (Arrays.equals(arr,arr1))
          return true;
      else
        return false;
    }

    public static void main(String[] args) {
        // דוגמאות לשימוש בשיטה areAnagrams
        String word1 = "listen";
        String word2 = "silent";
        String word3 = "apple";
        String word4 = "pale";

        System.out.println("Are \"" + word1 + "\" and \"" + word2 + "\" anagrams? " + areAnagrams(word1, word2));
        System.out.println("Are \"" + word3 + "\" and \"" + word4 + "\" anagrams? " + areAnagrams(word3, word4));
    }
}