package LinkedListPractice;

public class Main {
	public static void main(String[] args) {
		LinkedListNode node = new LinkedListNode(1);
		node.next = new LinkedListNode(2);
		node.next.next = new LinkedListNode(3);
		node.next.next.next = new LinkedListNode(4);
		node.next.next.next.next = new LinkedListNode(5);
		
		Solution s = new Solution();
		LinkedListNode result = s.remove(node, 3);
		while(result!=null) {
			System.out.println(result.value);
			result = result.next;
		}
	}
}
