package main.java.ldd.link_list;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author lidongdong
 * @version 1.0
 * @date 2021/11/12 11:06
 */

/*
* 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现的
* 的数字。返回同样按升序排列的结果链表。
输入：head = [1,2,3,3,4,4,5]
输出：[1,2,5]
*
* */
public class Solution82 {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(2);
        ListNode fifth = new ListNode(3);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Solution82 solution82 = new Solution82();
        ListNode result = solution82.deleteDuplicates(first);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    //删掉重复的元素 一个也不保留  不是删除重复的元素但是保留一个！！！！
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            return head;
        }

        ListNode result = new ListNode(0,head);
        ListNode move = result;
        while(move.next != null && move.next.next != null ){

            if(move.next.val == move.next.next.val){
                int temp = move.next.val;//很好
                while(move.next != null && move.next.val == temp){
                    move.next = move.next.next;
                }
            }else{
                move = move.next;

            }
        }
        return result.next;

    }




}
