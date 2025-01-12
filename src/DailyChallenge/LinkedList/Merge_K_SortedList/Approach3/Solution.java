package DailyChallenge.LinkedList.Merge_K_SortedList.Approach3;

import java.util.PriorityQueue;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
} 
class Solution {
     public ListNode mergeKLists(ListNode[] lists){
        if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b) -> a.val -b.val);

        for(ListNode node : lists){
            if (node != null) {
                queue.offer(node);
            }
        }
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while(!queue.isEmpty()){
            ListNode node = queue.poll();
            temp.next = node;
            temp = temp.next;
            if (node.next != null) {
                queue.offer(node.next);
            }
        }
        return dummy.next;
     }
}
