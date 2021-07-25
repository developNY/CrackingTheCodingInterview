package Ch02_Linked_Lists.Q2_04_Partition;

import CtCILibrary.LinkedListNode;

public class QuestionAQ {
    public static LinkedListNode partition(LinkedListNode head, int rnd){
        LinkedListNode beforeStart = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode afterStart = null;
        LinkedListNode afterEnd = null;

        //맞는거
//            /* Partition list */
//            while (head != null) {
//                LinkedListNode next = head.next;
//                head.next = null;
//                if (head.data < rnd) {
//                    if (beforeStart == null) {
//                        beforeStart = head;
//                        beforeEnd = head;
//                    } else {
//                        beforeEnd.next = head;
//                        beforeEnd = head;
//                    }
//                } else {
//                    if (afterStart == null) {
//                        afterStart = head;
//                        afterEnd = head;
//                    } else {
//                        afterEnd.next = head;
//                        afterEnd = head;
//                    }
//                }
//                head = next;
//            }
//
//        if(beforeStart == null)
//            return afterStart;
//
//        beforeEnd.next = afterStart;
//        return beforeStart;
//        }

        
        //틀린거
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
        /* Create linked list */
        int[] vals = {43,5,10,5,10,6,3,5,9};
        LinkedListNode head = new LinkedListNode(vals[0], null, null);
        LinkedListNode current = head;
        for (int i = 1; i < vals.length; i++) {
            current = new LinkedListNode(vals[i], null, current);
        }
        System.out.println(head.printForward());

        /* Partition */
        LinkedListNode h = partition(head, 6);

        /* Print Result */
        System.out.println(h.printForward());
    }
}
