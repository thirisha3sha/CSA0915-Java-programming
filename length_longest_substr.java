/* Given a string s, find the length of the longest substring without duplicate characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.    */
public class length_longest_substr {
    public static void main(String[] args) {
        System.out.println(longest_substr("abcabcbb"));
    }

    public static int longest_substr(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean seen[] = new boolean[256];
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (seen[c]) {
                    break;
                }
                seen[c] = true;
                max = Math.max(max, j - i + 1); // j-i+1 is representing the current len of string

            }
        }
        return max;
    }

}
