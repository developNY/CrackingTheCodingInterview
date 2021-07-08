package Ch01_Arrays_and_Strings.Q1_05_One_Away;

import java.util.Arrays;

public class QuestionA {
    //O(nlogn) Using sort
    public static boolean checkOneWay(String a, String b){
        char[] short_arr = a.length() <= b.length() ? a.toCharArray() : b.toCharArray();
        char[] long_arr = a.length() <= b.length() ? b.toCharArray() : a.toCharArray();
        Arrays.sort(short_arr);
        Arrays.sort(long_arr);
        int diff = 0;
        int b_cnt = 0;
        int len = short_arr.length == long_arr.length ? short_arr.length -1 : short_arr.length;
        for (int i = 0; i < len; i++) {
            if(short_arr[i] != long_arr[b_cnt]){
                diff++;
                if(diff > 1 || short_arr[i] != long_arr[b_cnt+1])
                    return false;
                b_cnt++;
            }
            b_cnt++;
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"pale", "ple"},{"pales", "pale"},{"pale", "bale"},{"pale", "balse"}};
        for (String[] pair : pairs) {
            System.out.println(checkOneWay(pair[0], pair[1]));
        }
    }
}
