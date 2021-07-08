package Ch01_Arrays_and_Strings.Q1_05_One_Away;

import java.util.Arrays;

public class QuestionA {
    public static boolean checkOneWay(String a, String b, int len){
        char[] a_arr = a.toCharArray(); //short
        char[] b_arr = b.toCharArray(); //long
        Arrays.sort(a_arr);
        Arrays.sort(b_arr);
        int b_cnt = 0;
        int diff = 0;
        for (int i = 0; i < len; i++) {
            if(a_arr[i] != b_arr[b_cnt]){
                diff++;
                if(diff > 1 || a_arr[i] != b_arr[b_cnt+1])
                    return false;
                b_cnt++;
            }
            b_cnt++;
        }
        return true;
    }

    public static boolean oneEditAway(String a, String b){
        if(Math.abs(a.length()-b.length()) > 2)
            return false;
        if(a.length() == b.length())
            return checkOneWay(a, b, a.length()-1);
        else if (a.length() > b.length())
            return checkOneWay(b, a, b.length());
        else
            return checkOneWay(a, b, a.length());
    }

    public static void main(String[] args) {
        String[][] pairs = {{"pale", "ple"},{"pales", "pale"},{"pale", "bale"},{"pale", "bakse"}};
        for (String[] pair : pairs) {
            System.out.println(oneEditAway(pair[0], pair[1]));
        }
    }
}
