package main.java.ldd.link_list;

/**
 * TODO
 *
 * @author lidongdong
 * @version 1.0
 * @date 2021/11/9 16:03
 */

/*
* 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点
*
* */
public class Solution19 {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;


        Solution19 solution19 = new Solution19();
        ListNode result = solution19.removeNthFromEnd(head,4);

        while (result != null){
            System.out.println("链表值 " + result.val);
            result = result.next;
        }

    }


    public ListNode removeNthFromEnd(ListNode head, int n) {


        int length =0;
        ListNode test = head;
        while(test != null){
            length++;
            test = test.next;
        }

        //删除第 length-n+1 个 操作第length-n个、
        ListNode tail = new ListNode(0,head);
        ListNode result = tail;
        for(int i = 1;i < length-n+1;i++){
                tail = tail.next;

        }
        tail.next=tail.next.next;
        //return head; //删除第一个元素这样就不对了  tail指针变了 但是head没变
        return result.next;
    }
}
