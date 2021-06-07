import java.util.Arrays;

public class Number395Other {
	public int longestSubstring(String s, int k) {
        return longestSubstringUtil(s, 0, s.length(), k);
    }

    int longestSubstringUtil(String s, int start, int end, int k) {
        if (end < k) return 0;
        int[] countMap = new int[26];
        // update the countMap with the count of each character
        for (int i = start; i < end; i++) {
            countMap[s.charAt(i) - 'a']++;
        	System.out.println("Here");
            System.out.println(Arrays.toString(countMap));
        }
        
        for (int mid = start; mid < end; mid++) {
        	System.out.println("initial mid: " +mid);
            if (countMap[s.charAt(mid) - 'a'] >= k) continue;
            System.out.println("Entered into continue");
            System.out.println("mid after continue: " +mid);
            int midNext = mid + 1;
            System.out.println("MidNext is: "+ midNext);
            while (midNext < end && countMap[s.charAt(midNext) - 'a'] < k) midNext++;
            System.out.println("MidNext is: "+ midNext);
            return Math.max(longestSubstringUtil(s, start, mid, k),
                    longestSubstringUtil(s, midNext, end, k));
        }
        int result=end-start;
        return result;
        
        
    }
    
    public static void main(String[]args) {
    	Number395Other test=new Number395Other();
    	test.longestSubstring("acaabbec", 2);
    	System.out.println(test.longestSubstring("acaabbec", 2));
    }
}
