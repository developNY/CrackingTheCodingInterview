package Ch01_Arrays_and_Strings.Q1_05_One_Away;

import java.util.Arrays;

public class QuestionB {
    //O(n) Using while-loop, Not use Array
    public static boolean checkOneWay(String a, String b){
        String s1 = a.length() < b.length() ? a : b;
        String s2 = a.length() < b.length() ? b : a;
        int idx1 = 0, idx2 = 0;
        boolean diff = false;
        while(idx1 < s1.length() && idx2 < s2.length()) {
            if (s1.charAt(idx1) != s2.charAt(idx2)) {
                if (diff) return false;
                diff = true;
                if (s1.length() == s2.length()) idx1++;
            } else {
                index1++;
            }
            idx2++;
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"pale", "ple"},{"pales", "pale"},{"pale", "bale"},{"pale", "bake"}};
        for (String[] pair : pairs) {
            System.out.println(checkOneWay(pair[0], pair[1]));
        }
    }
}
