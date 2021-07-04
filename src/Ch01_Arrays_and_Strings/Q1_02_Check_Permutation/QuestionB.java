package Ch01_Arrays_and_Strings.Q1_02_Check_Permutation;

public class QuestionB {
    public static int[] StringToIntArr(String str){
        int[] arr = new int[128];               //Assumption: ASCII
        char[] res = str.toCharArray();
        for (int i = 0; i < res.length; i++) {
            arr[res[i]]++;
        }
        return arr;
    }
    public static boolean permutation(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] a_arr = StringToIntArr(a);
        int[] b_arr = StringToIntArr(b);

        for (int i = 0; i < a_arr.length; i++) {
            if (a_arr[i] != b_arr[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String a = pair[0];
            String b = pair[1];
            System.out.println("(" + a + " ," + b + "): " + permutation(a, b));
        }
    }
}
