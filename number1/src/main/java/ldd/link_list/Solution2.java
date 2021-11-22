package main.java.ldd.link_list;

/**
 * TODO
 *
 * @author lidongdong
 * @version 1.0
 * @date 2021/9/16 15:58
 */
public class Solution2 {

    private static class ListNode {
      int val;
      ListNode next;
      ListNode(int val) { this.val = val; }
  }

    public static void main(String[] args) {

      // test 22 + 99 = 121
    ListNode l1 = new ListNode(2);
    ListNode l11 = new ListNode(2);
    ListNode l2 = new ListNode(9);
    ListNode l22 = new ListNode(9);

    l1.next = l11;
    l2.next = l22;

    Solution2 solution2 = new Solution2();
    ListNode result = solution2.addTwoNumbers(l1, l2);
    System.out.println(result.val + " " + result.next.val+" "+ result.next.next.val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


      int carry = 0;
      ListNode head = null;//头结点 head 指向链表第一个元素的地址
      ListNode tail = null;

      while (l1 != null || l2 != null){

        int n1 = l1 != null ? l1.val : 0;
        int n2 = l2 != null ? l2.val : 0;
        int sum =n1 + n2 + carry;

        if(head == null){
          head = tail = new ListNode(sum % 10);

         } else{
          tail.next = new ListNode(sum % 10);
          tail = tail.next;
        }
           carry = sum / 10;//和大于10 取整 获得进位

        if(l1 != null)
          l1 = l1.next;
        if(l2 != null)
          l2 = l2.next;

      }
      if(carry > 0)//最高位相加大于10的话 继续进位
        tail.next = new ListNode(carry);

      return head;


    }
}
