
public class number13Other {
	public int romanToInt(String s) {
		int sum=0;
		for (int i=0; i<s.length(); i++) {
			if(i+1<s.length() && getValue(s.charAt(i))<getValue(s.charAt(i+1))) {
				sum=sum-getValue(s.charAt(i));
			}else {
				sum=sum+getValue(s.charAt(i));
			}
		}
		return sum;
	}

	
	public int getValue(char c) {
		switch(c) {
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		}
		return 0;
	}
	
	
	public static void main(String[]args) {
		number13Other test=new number13Other();
		System.out.println("This is Number13Other");
		test.romanToInt("III");
		System.out.println(test.romanToInt("IV"));
}
}