package Ch02_Linked_Lists.Q2_02_Return_Kth_To_Last;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class QuestionC {
    public static LinkedListNode kthToLast(LinkedListNode head, int k){
        LinkedListNode p1 = head;
        for (int i = 0; i < k; i++) {
            if(p1 == null) return null; //Out of bound
            p1 = p1.next;
        }

        while(p1.next != null){
            p1 = p1.next;
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
        for (int i = 0; i <= array.length+1; i++) {
            LinkedListNode node = kthToLast(head, i);
            String nodeValue = node == null ? "null" : "" + node.data;
            System.out.println(i + ": " + nodeValue);
        }
    }
}
