package LeetCode.April;

public class PalindromeList {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	
	
	public static void main(String[] args) {
		
	}

	public boolean isPalindrome(ListNode head) {

		StringBuilder str = new StringBuilder("");
		while(head.next != null){

			str.append(Integer.toString(head.val));
			head = head.next;
		}
		String temp = str.toString();
		str.reverse();
		return temp.equals(str.toString());

	}

}
