package Ch01_Arrays_and_Strings.Q1_04_Palindrome_Permutation;

import java.util.Locale;

//Using only 1 for-loop
//pelindrom needs only one odd num
public class QuestionB {
    public static boolean palindromePermutation(String str){
        str = str.replaceAll(" ", "");
        str = str.toLowerCase(Locale.ROOT);

        int[] cnt = new int[128];       //ascii
        int cntOdd = 0;

        for (int i = 0; i < str.length(); i++){
            cnt[str.charAt(i)]++;
            if(cnt[str.charAt(i)]%2 == 0){
                cntOdd--;
            }else{
                cntOdd++;
            }
        }

        if(cntOdd>1)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        String str = "Rats live on no evil star";
        System.out.println(palindromePermutation(str));
    }
}
