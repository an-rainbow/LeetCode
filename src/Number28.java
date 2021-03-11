
public class Number28 {
	public int strStr(String haystack, String needle) {
    if(needle.isEmpty() || haystack.equals(needle)) {
    	return 0;}
    
    //这个取值范围要注意一下： i<=haystack.length()-needle.length()
    for (int i=0; i<=haystack.length()-needle.length(); i++) {
    	String evalString=haystack.substring (i,i+needle.length());
    	if(evalString.equals(needle)) {
    		return i;
    	}
    	
    }
    return -1;
    }
    
	public static void main(String []args) {
		Number28 test=new Number28();
		test.strStr("abcde","abd");
		System.out.println("This is Number 28");
		System.out.println(test.strStr("abcde","bc"));
	}
    
    
}
