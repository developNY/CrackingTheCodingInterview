package Ch02_Linked_Lists.Q2_04_Partition;

public class QuestionB {
    public static void main(int[] args) {
        int i, j, key;

        for(i=1; i< args.length; i++){
            j = i-1;
            key = args[i];

            while(j>=0 && args[j] > key){
                args[j+1] = args[j];
                j--;
            }
            args[j] = key;
        }
    }
}
