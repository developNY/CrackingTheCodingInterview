package Ch01_Arrays_and_Strings.Q1_05_One_Away;

import java.util.Arrays;

public class QuestionA {
    public static boolean checkOneWay(String a, String b){
        if(Math.abs(a.length()-b.length()) != 1)
            return false;
        if(a.length() > b.length()){
            String tmp;
            tmp = a;
            a = b;
            b = tmp;
        }
        char[] a_arr = a.toCharArray(); //short
        char[] b_arr = b.toCharArray(); //long
        Arrays.sort(a_arr);
        Arrays.sort(b_arr);
        int b_cnt = 0;
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a_arr[i] != b_arr[b_cnt]){
                diff++;
                if(a_arr[i] != b_arr[b_cnt+1])
                    return false;
                b_cnt++;
            }
            b_cnt++;
        }
        return diff < 2;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"pale", "bake"}};
        for (String[] pair : pairs) {
            System.out.println(checkOneWay(pair[0], pair[1]));
        }
    }
}
