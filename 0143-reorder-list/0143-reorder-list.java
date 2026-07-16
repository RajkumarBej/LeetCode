/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return;
        ListNode curr=head,currNext=null,prev=null,last=head;
        while(last.next != null){
            prev=last;
            last=last.next;
        }
        if(prev!=null)
        prev.next=null;
        currNext=curr.next;
        curr.next=last;
        last.next=currNext;
        reorderList(currNext);
    }
}