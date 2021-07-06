package Ch01_Arrays_and_Strings.Q1_03_URLify;

public class Question {
    //use char
    //O(n)
    public static String urlify(String str, int len){
        char[] arr = str.toCharArray();
        int spaceCnt = 0;

        for (int i = 0; i < len; i++) {
            if(arr[i] == ' '){
                spaceCnt++;
            }
        }

        char[] res = new char[len + spaceCnt*2];
        int cnt = 0;

        for (int i = 0; i < res.length; i++) {
            if(arr[i] == ' '){
                res[i] = '%';
                res[i+1] = '2';
                res[i+2] = '0';
                i += 2;
            } else {
                res[i] = arr[cnt];
            }
        }

        return res.toString();
    }

    //Use String
    public static String urlify1(String str, int len){
        String res = str.replace(" ", "%20");
        return res;
    }

    public static void main(String[] args) {
        String str = "Mr John Smith      whwhwhw";
        int len = 13;
        System.out.println(urlify1(str, len));
    }
}