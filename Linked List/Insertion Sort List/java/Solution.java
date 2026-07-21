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
    public ListNode insertionSortList(ListNode left) {
       ArrayList<Integer>list=new ArrayList<>();
        ListNode right=left;
        while(right!=null){
            list.add(right.val);
            right=right.next;
        }
        list.sort(null);
        right=left;
        int index=0;
        while(right!=null){
            right.val=list.get(index++);
            right=right.next;
        }
        return left;
 
    }
}