package Ch01_Arrays_and_Strings.Q1_04_Palindrome_Permutation;

import java.util.Locale;

//Using Hash Table
//pelindrom needs only one odd num or only even nums
public class QuestionA {
    public static boolean palindrome(String str){
        str = str.replaceAll(" ", "");
        int mid = str.length()/2;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(i+(mid-i)*2)){
                return false;
            }
        }
        return true;
    }

    public static boolean palindromePermutation(String str){
        str = str.replaceAll(" ", "");
        str = str.toLowerCase(Locale.ROOT);

        int[] cnt = new int[128];       //ascii
        for (int i = 0; i < str.length(); i++)
            cnt[str.charAt(i)]++;

        int cntOdd = 0;
        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i]%2 == 1)
                cntOdd++;
        }

        if(cntOdd > 1)
            return false;
        else
            return true;
    }
}
