package LinkedListPractice;

public class Solution {
	public LinkedListNode remove(LinkedListNode head, int val) {
		LinkedListNode node = head;
		while(node.next!=null) {
			if(node.next.value>val) {
				node.next = node.next.next;
			}
			else {
				node = node.next;
			}
		}
		
		return head;
	}
}
