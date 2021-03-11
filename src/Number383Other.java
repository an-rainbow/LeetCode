import java.util.HashMap;
import java.util.Map;

public class Number383Other {

	
	public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<magazine.length(); i++)
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        
        for(int i=0; i<ransomNote.length(); i++) {
            if(map.containsKey(ransomNote.charAt(i))) {
                int a = map.get(ransomNote.charAt(i));
                a -= 1;
                if(a == 0)
                    map.remove(ransomNote.charAt(i));
                else {
                	map.remove(ransomNote.charAt(i));
                	map.put(ransomNote.charAt(i), a);
                }
            } else
                return false;
        }
        return true;
    }
	
	
	
	
	
	
}
