package Ch02_Linked_Lists.Q2_01_Remove_Dups;

import CtCILibrary.LinkedListNode;

public class QuestionB {
    //O(n^2)
    //Not use buffer(Set) Use 2 pointers
    public static void deleteDup(LinkedListNode head){
        LinkedListNode current = head;
        while(current != null){
            LinkedListNode runner = current;
            while(runner.next != null){
                if(current.data == runner.next.data){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next;
                }
            }
            current = current.next;
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
