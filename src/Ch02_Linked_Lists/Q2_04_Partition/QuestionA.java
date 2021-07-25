package Ch02_Linked_Lists.Q2_04_Partition;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class QuestionA {
    public static LinkedListNode partition(LinkedListNode head, int rnd){
        LinkedListNode beforeStart = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode afterStart = null;
        LinkedListNode afterEnd = null;

        while(head != null){
            LinkedListNode next = head.next;
            head.next = null;

            if(head.data > rnd){
                if(afterStart == null){
                    afterStart = head;
                    afterEnd = head;
                }else{
                    afterEnd.next = head;   //addNode
                    afterEnd = head;        //move(because or prev)
                }
            }else{
                if(beforeStart == null){
                    beforeStart = head;
                    beforeEnd = head;
                }else{
                    beforeEnd.next = head;
                    beforeEnd = head;
                }
            }
            head = next;
        }

        if(beforeStart == null)
            return afterStart;

        beforeEnd.next = afterStart;
        return beforeStart;
    }

    public static void main(String[] args) {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        int rnd = (int)(Math.random()*10000)%10;
        System.out.println("random int: " + rnd);
        System.out.println("Before: " + head.printForward());
        System.out.println("After: " + partition(head, rnd).printForward());
    }
}
