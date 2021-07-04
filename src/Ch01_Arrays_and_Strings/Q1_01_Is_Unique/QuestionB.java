package Ch01_Arrays_and_Strings.Q1_01_Is_Unique;

// Do not use Data Structure

import java.util.Arrays;

public class QuestionB {
    //O(n^2), O(1), Using multiple for-loop
    public static boolean isUniqueStr1(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j))
                    return false;
            }
        }
        return true;
    }

    //O(nlongn), O(1), String allignment
    public static boolean isUniqueStr2(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "tree", "hungry"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueStr1(word));
            System.out.println(word + ": " + isUniqueStr2(word));
        }
    }
}
