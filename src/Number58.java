


public class Number58 {
	
	public int lengthOfLastWord(String s) {
		
		int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                len++;
            } else if (len > 0) {
                return len;
            }
        }
        return len;
		}
		
		public static void main(String[]args) {
			Number58 test=new Number58();
			System.out.println("This is Number58");
			test.lengthOfLastWord("Hello World");
			System.out.println(test.lengthOfLastWord("Hello World"));
		}
	}


