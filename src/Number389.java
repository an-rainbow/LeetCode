
/*We need to use count of every char because this is what stays constant after permutation of the original string. As we know possible range of chars and it's small - 
 * only english lowercase letters which is 26 - we can use preallocated array that will keep count of every char. '
Scan the original string and increment count of every char. Index of the count can be calculated as "char - 'a'" which gives range [0...25].
Do the second scan of the t (processed) string, for each character decrement it's count from the array of counts. Three cases are possible:
char has only change place, count will be the same between two strings, at the end count array will have 0 for this char.
example is char "a" in s="aabd" and t="adbat", count will be 2 after scaning of s and 0 after scaning of t

one of existing characters has been added to t, in this case count array will have count_of_char, but t will have count_of_char + 1. 
if we decrement the count at the end we'll have -1 for this char.
example is char "a" in s="aabd" and t="adaba", count will be 2 after scaning of s and -1 after scaning of t

some character that was not present in original string has been added. in such case count array will have 0 for this char, 
and when we decrement the count at the end we'll have -1 for this char.
example is char "t" in s="aabd" and t="adabt", count will be 0 after scaning of s and -1 after scaning of t

It should be obvious at this point that the char that has been added will produce -1 during the scanning of t string. 
We need to check the count after every one character has been processed and return the character that caused this -1 count.

O(n) time - scan both string once, O(n) + O(n + 1) gives as O(n)
O(1) space - array is preallocated (with length 26) and thus does not depend on size of the input.*/

public class Number389 {
	public char findTheDifference(String s, String t) {

		int[] counts = new int[26];
		for (char ch : s.toCharArray()) {
			++counts[ch - 'a'];
		}
		for (char ch : t.toCharArray()) {
			--counts[ch - 'a'];
			if (counts[ch - 'a'] < 0)
				return ch;
		}
		return ' ';
	}

}
