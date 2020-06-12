/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ls=new ListNode(0);
        ListNode head=ls;//保存新链表的头结点，便于返回
        
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                ls.next=l1;
                ls=ls.next;
                l1=l1.next;
            }else{
                ls.next=l2;
                ls=ls.next;
                l2=l2.next;
            }   
            
        }
        if(l1!=null){
            ls.next=l1;
        }
        if(l2!=null){
            ls.next=l2;
        }
        return head.next;
    }
}