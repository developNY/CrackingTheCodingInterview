package Amazon;

import java.util.HashSet;
import java.util.Set;

public class Question4 {
    public static int findMaximumSum(int[] stockPrice, int k){
        Set<Integer> s = new HashSet<>();
        int res = 0;

        for(int i=0; i<stockPrice.length; i++){
            for(int j=i; j<stockPrice.length; j++) {
                if(s.contains(stockPrice[j]) || s.size() == k)
                    break;
                else if(!s.contains(stockPrice[j]))
                    s.add(stockPrice[j]);
            }
            if(s.size() == k)
                res++;
            s.clear();
        }

        return res;
    }

    public static void main(String[] args) {
        int[] stockPrice = {1,2,7,7,4,3,6};
        int k = 3;

        System.out.println(findMaximumSum(stockPrice, k));
    }
}
