package Ch01_Arrays_and_Strings.Q1_06_String_Compression;

public class QuestionC {
    //Using StringBuilder
    public static String compressBad(String str){
        StringBuilder sentence = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                sentence.append(str.charAt(i));
                sentence.append(cnt);
                cnt = 0;
            }
        }
        return sentence.toString();
    }

    public static String compareLength(String str){
        int resLen = 0;
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                resLen += 1 + String.valueOf(cnt).length(); //Caution!
                cnt = 0;
            }
        }
        return str.length() < resLen ? str : compressBad(str);
    }

    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaa";
        System.out.println(compareLength(str));
    }
}
