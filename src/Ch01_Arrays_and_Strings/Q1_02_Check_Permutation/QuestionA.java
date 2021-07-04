package Ch01_Arrays_and_Strings.Q1_02_Check_Permutation;

import java.util.Arrays;

public class QuestionA {
    //O(nlogn)
    public static String sort(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);             //char array to String
    }

    //Permutation: The type and number of chars are the same, but the order does not matter
    public static boolean permutation(String a, String b){
        if(a.length() != b.length())
            return false;
        return sort(a).equals(sort(b));         //Check case sensitive and blank
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String a = pair[0];
            String b = pair[1];
            System.out.println("(" + a + " ," + b + "): " + permutation(a, b));
        }
    }
}
