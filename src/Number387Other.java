import java.util.HashMap;

//Linear time solution
//The best possible solution here could be of a linear time because to ensure that the character is unique you have to check the whole string anyway.

//The idea is to go through the string and save in a hash map the number of times each character appears in the string. That would take \mathcal{O}(N)O(N) time, 
//where N is a number of characters in the string.

//And then we go through the string the second time, this time we use the hash map as a reference to check if a character is unique or not.
//If the character is unique, one could just return its index. The complexity of the second iteration is \mathcal{O}(N)O(N) as well.


//遍历两遍string 数组

public class Number387Other {
	
	public int firstUniqChar(String s) {
	HashMap<Character, Integer> map=new HashMap<>();
	for (char c: s.toCharArray()) {
		map.put('c', map.getOrDefault(c,0)+1);
	}
	for (int i=0; i<s.length(); i++) {
		if(map.get(s.charAt(i))==1) {
			return i;
		}
	}
	return -1;
	}
	
}
