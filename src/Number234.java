
public class Number234 {
	
	public boolean isPalindrome(ListNode head) {
		
	/*Setup two pointers, fast && slow
	 *find the middle point (fast!=null && fast.next!=null)
	 *reverse the second half
	 *compare the value of both half
	 */
		
	ListNode fast=head;
	ListNode slow=head;
	
	while(fast!=null && fast.next!=null ) {
		fast=fast.next.next;
		slow=slow.next;
	}
	
	ListNode prev=null;
	slow=slow.next;
	while (slow!=null) {
		ListNode next=slow.next;
		slow.next=prev;
		prev=slow;
		slow=next;	
	}
	
	while (slow!=null) {
	if(head.value==slow.next.value) {
		head=head.next;
		slow=slow.next;	
	}
	return true;
	}
		
		
		
		
	}

}
