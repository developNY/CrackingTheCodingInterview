package Amazon;

import java.util.Arrays;

public class Question3 {
    public static int getMinimumTrips(int[] weights){
        Arrays.sort(weights);
        int res = 0;
        int j=1;

        for(int i=0; j<weights.length;){
            if(weights[i] != weights[j] && j-i > 2){
                if((j-i)%3 != 0)
                    res++;
                res += (j-i)/3;
                i = j; j++;
            }else if(weights[i] == weights[j]){
                j++;
            }else{
                res++;i++;j++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] weights = {2,3,3,4,4,4,4,5,6,7};
        System.out.println(getMinimumTrips(weights));
    }
}
