package Ch02_Linked_Lists.Q2_01_Remove_Dups;

import CtCILibrary.LinkedListNode;

public class QuestionC {
    public static void deleteDup(LinkedListNode head){
        if(head == null)    return;
        LinkedListNode previous = head;
        LinkedListNode current = previous.next;
        while(current != null){
            LinkedListNode runner = head;
            while (runner != current){
                if(runner.data == current.data){
                    LinkedListNode tmp = current.next;
                    previous.next = tmp;
                    previous.next = tmp;
                    current = tmp;
                    break;
                }
                runner = runner.next;
            }
            if(runner == current){
                previous = current;
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListNode first = new LinkedListNode(0, null, null);
        LinkedListNode head = first;
        LinkedListNode second = first;
        for (int i = 0; i < 8; i++) {
            second = new LinkedListNode(i%2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        System.out.println(head.printForward());
        deleteDup(head);
        System.out.println(head.printForward());
    }
}