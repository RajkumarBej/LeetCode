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
    ListNode rotate(ListNode head){
        if(head == null || head.next==null)return head;
        ListNode curr=head,prev=null;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        curr.next=head;
        return curr;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next==null)return head;
        ListNode curr=head;
        int n=1;
        while(curr.next!=null){
            n+=1;
            curr=curr.next;
        }
        if(k>n)k=k%n;//if k=20000000 so find remender to avoid repeatation
        else if(k==n)return head;
        for(int i=0;i<k;i++){
            head=rotate(head);
        }
        return head;
    }
}