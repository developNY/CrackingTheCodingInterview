package Ch01_Arrays_and_Strings.Q1_06_String_Compression;

public class QuestionA {
    public static String compressBad(String str){
        String res = "";
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                res += String.valueOf(str.charAt(i)) + cnt;
                cnt = 0;
            }
        }
        return str.length() < res.length()? str : res;
    }

    public static void main(String[] args) {
        String str = "aabccccaaaa";
        System.out.println(compressBad(str));
    }
}
