package Amazon;

public class Question2 {
    public static int[] commonPrefix(String inputs[]){
        int len  = inputs.length;
        int[] res = new int[len];

        for(int i=0; i<len; i++)
            res[i] = sumPrefix(inputs[i], inputs[i].length());

        return res;
    }

    public static int sumPrefix(String str, int len){
        int sum = len;

        for(int i=1; i<len; i++){
            String prefix = str.substring(0, i);
            String suffix = str.substring(i, len);
            int min = Math.min(prefix.length(), suffix.length());
            for(int j=0; j<min; j++){
                if(prefix.charAt(j) == suffix.charAt(j))
                    sum++;
                else
                    break;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] arr = {"a", "ababaa", "aa", "abcabcd"};
        int[] res = commonPrefix(arr);
        for(int r : res)
            System.out.println(r);
    }
}
