import java.util.HashMap;

public class Number13 {
	
	private HashMap<Character, Integer> map;
	
	public Number13() {
		map=new HashMap<>();
		map.put('I', 1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
	}
	
	public int romanToInt(String s) {
		
		int sum=0;
		int i=s.length()-1;
		
		//Not quite understand the logic inside while loop, after the 1st i--, the 
		//other i-- inside if function also do another i--?
		while (i>0) {
			int prev=map.get(s.charAt(i-1));
			int curr=map.get(s.charAt(i));
			sum=sum+curr;
			i--;
			if(prev<curr) {
				sum=sum-prev;
				i--;
			}
			
		}
		if(i<0) return sum;
		sum=sum+map.get(s.charAt(0));
		return sum;
		}
		
		

	
	public static void main(String[]args) {
		Number13 test=new Number13();
		System.out.println("This is Number13");
		test.romanToInt("III");
		System.out.println(test.romanToInt("IV"));
	}




}