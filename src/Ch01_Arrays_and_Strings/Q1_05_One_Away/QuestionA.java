package Ch01_Arrays_and_Strings.Q1_05_One_Away;

import java.util.Arrays;

public class QuestionA {
    public static boolean checkOneWay(String a, String b){
        //add&delete&replace: check diff 1
        //1 for-loop compare and count different value
        //exception diff letter num > 2 X
        if(Math.abs(a.length()-b.length())<2)
            return false;
        char[] a_arr = a.toCharArray();
        char[] b_arr = b.toCharArray();
        Arrays.sort(a_arr);
        Arrays.sort(b_arr);
        int b_cnt = 0;
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a_arr[i] != b_arr[b_cnt]){
                diff++;
                if()
            }
            b_cnt++;


        }
        return true;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"pale", "ple"}};
        for (int i = 0; i < pairs.length; i++) {
            System.out.println(checkOneWay(pairs[i][0], pairs[i][1]));
        }
    }
}
