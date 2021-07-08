package Ch01_Arrays_and_Strings.Q1_06_String_Compression;

public class QuestionB {
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
        return str.length() < sentence.length()? str : sentence.toString();
    }

    public static void main(String[] args) {
        String str = "aabccccaaaa";
        System.out.println(compressBad(str));
    }
}
