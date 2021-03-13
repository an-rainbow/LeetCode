
public class Number415 {
	public String addString(String num1, String num2) {
		StringBuilder res=new StringBuilder();
		
		int carry=0;
		int p1=num1.length()-1;
		int p2=num2.length()-1;
		while(p1>=0 || p2>=0) {
			int sum=carry;
			if (p1>=0) sum+=num1.charAt(p1)-'0';
			if (p2>=0) sum+=num2.charAt(p2)-'0';
			res.append(sum%10);
			carry=sum/10;
			p1--;
			p2--;
		}
		
		if(carry!=0) res.append(carry);
		return res.reverse().toString();
	}

}
