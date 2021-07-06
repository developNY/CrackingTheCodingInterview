package Ch01_Arrays_and_Strings.Q1_04_Palindrome_Permutation;

import java.util.Locale;

//Using Hash Table
//pelindrom needs only one odd num
public class QuestionMine {
    public static boolean palindrome(String str){
        str = str.replaceAll(" ", "");
        int mid = str.length()/2;
        //짝수홀수 계산 필요
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

        int cntOdd = 0, cntEven = 0;
        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i]%2 == 1)
                cntOdd++;
            else
                cntEven++;
        }

        if(cntOdd == 1 || cntOdd == 0 && cntEven%2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String str = "Rats live on no evil star";
        System.out.println(palindromePermutation(str));
    }
}
