package LeetCode.April;

import java.util.ArrayList;

public class PartitionList {
	
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode temp = new ListNode(1);
		temp.next = new ListNode(4);
		temp.next.next = new ListNode(3);
		temp.next.next.next = new ListNode(2);
		temp.next.next.next.next = new ListNode(5);
		temp.next.next.next.next.next = new ListNode(2);
		partition(temp,3);
		
	}
	
	public static ListNode partition(ListNode head, int x) {

		ArrayList<ListNode> flat = new ArrayList<>();
		while(head != null){

			flat.add(head);
			head = head.next;
		}
		ListNode lessthan = null;
		ListNode concat = null;
		ListNode greaterthan = null;
		System.out.println(flat.size());

		for(int i = flat.size()-1; i >= 0;i--){

			System.out.println("Gaming");
			if(flat.get(i).val < x){
				if(lessthan == null) {
					System.out.println("Saint");
					concat = flat.get(i);
				}
				flat.get(i).next = lessthan;
				lessthan = flat.get(i);
			}
			if(flat.get(i).val >= x) {
				flat.get(i).next = greaterthan;
				greaterthan = flat.get(i);
			}

		}
		concat.next = greaterthan;
		
		
		ListNode temp = lessthan;
		
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
		
		
		return temp;
		
		
	}

}
