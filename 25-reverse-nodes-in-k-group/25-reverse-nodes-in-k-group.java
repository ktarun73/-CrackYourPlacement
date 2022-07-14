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
    public ListNode reverseKGroup(ListNode head, int k) {
        int length=len(head);
        return reverseKGroup(head,k,length);
        
    }
    
    int len(ListNode head){
        int length=0;
        ListNode cur=head;
        while(cur!=null){
            length++;
            cur=cur.next;
        }
        return length;
    }
    
    
    ListNode reverseKGroup(ListNode head, int k, int length){
        if(length<k) return head;
        int count=0;
        ListNode cur=head , prev=null , next=null;
        while(count<k && cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            count++;   
        }
        
        if(next!=null){
            head.next=reverseKGroup(next,k,length-k);
        }
        return prev;
        
    }
}