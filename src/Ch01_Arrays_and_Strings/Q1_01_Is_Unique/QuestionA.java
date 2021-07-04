package Ch01_Arrays_and_Strings.Q1_01_Is_Unique;

public class QuestionA {
    //  O(n) / O(1)
    public static boolean isUniqueChars(String str){
        boolean[] arr = new boolean[128];           ////Ascii? Unicode? ask first. Ascii length = 128
        for (int i = 0; i < str.length(); i++) {
            char c  = str.charAt(i);
            if(arr[c])
                return false;
            arr[c] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"Apple", "tree", "hungry"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word));
        }
    }
}
