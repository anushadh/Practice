package problems.algorithms;

/*2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored 
in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/

public class AddTwoNumbers {

	public static void main(String[] args) {
		AddTwoNumbers atn = new AddTwoNumbers();
		
		ListNode l1 = new ListNode(0);
		l1.val = 2;
		ListNode l12 = new ListNode(0);
		l12.val = 4;
		l1.next = l12;
				
		ListNode l2 = new ListNode(0);
		l2.val = 5;
		ListNode l22 = new ListNode(0);
		l22.val = 6;
		l2.next = l22;
		
		atn.printLinkedList(l1);
		atn.printLinkedList(l2);
		ListNode result = atn.addTwoNumbers(l1, l2);
		atn.printLinkedList(result);
	}

	private void printLinkedList(ListNode l) {
		while(l != null) {
			System.out.print(l.val);
			l = l.next;
			System.out.print(" ");
		}
		System.out.println();
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode current = result;
		int carry = 0;
		while(l1 != null || l2 != null) {
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;
			int sum = x + y + carry;
			carry = sum/10;
			current.next = new ListNode(sum%10);
			//printLinkedList(current);
			current = current.next;
			//printLinkedList(current);
			if(l1 != null) {
				l1 = l1.next;
			}
			if(l2 != null) {
				l2 = l2.next;
			}
			
		}
		
		if(carry > 0) {
			current.next = new ListNode(carry);
		}
		
		return result.next;
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}