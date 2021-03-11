
public class Number21 {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		
        ListNode list=new ListNode(-1);
        if(l1==null) {
        	return l2;
        }
        
        if(l2==null) {
        	return l1;
        }
        
        ListNode it1=l1;
        ListNode it2=l2;
        
        ListNode it=list;
        
        while(it1!=null && it2!=null){
            if(it1.value<=it2.value){
                it.next=it1;
                it1=it1.next;
                it=it.next;
            }else{
                it.next=it2;
                it2=it2.next;
                it=it.next;
            }   
        }
        while (it1!=null){
        	it.next=it1;
            it1=it1.next;
            it=it.next;
        }
        
        while (it2!=null){
        	it.next=it2;
            it2=it2.next;
            it=it.next;
        }
        return it.next;
    }

}
