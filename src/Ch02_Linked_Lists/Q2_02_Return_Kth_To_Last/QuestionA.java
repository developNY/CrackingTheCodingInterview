package Ch02_Linked_Lists.Q2_02_Return_Kth_To_Last;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class QuestionA {
    public static int printKthToLast(LinkedListNode head, int k){
        if(head == null){
            return 0;
        }
        int index =
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
        for (int i = 0; i < array.length; i++) {
            printKthToLast(head, i);
        }
    }
}
