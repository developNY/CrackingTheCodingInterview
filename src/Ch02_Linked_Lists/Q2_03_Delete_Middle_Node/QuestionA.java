package Ch02_Linked_Lists.Q2_03_Delete_Middle_Node;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class QuestionA {
    public static LinkedListNode deleteNode(LinkedListNode head){
        if(head == null || head.next == null)
            return null;

       head.next = head.next.next;
       return head;
    }

    public static void main(String[] args) {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println("Before: " + head.printForward());
        head = deleteNode(head);
        System.out.println("After: " + head.printForward());
    }
}
