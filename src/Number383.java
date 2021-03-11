
public class Number383 {
	
	public boolean canConstruct(String ransomNote, String magazine) {
		if(ransomNote==null) return true;
		if(magazine==null) return false;
		
		
		//这个把string转换成int数组，并且enhanced for loop之后， return 数组array++
		//以前没有遇到过，再次看的时候再记录一下。
		
		int[]arr1=new int [26];
		int[]arr2=new int[26];
		
		for (char c: ransomNote.toCharArray()) {
			arr1[c-'a']++;
		}
		for (char c: magazine.toCharArray()) {
			arr2[c-'a']++;
		}
		
		for (int i=0; i<26; i++) {
			if(arr1[i]!=0 && arr1[i]>arr2[i]) {
				return false;
			}
				
		}
		return true;
	}

}
