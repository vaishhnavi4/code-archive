import java.util.Scanner;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int cnt1[] = new int[26];
        int cnt2[] = new int[26];

        for (char c : s.toCharArray()) {
            cnt1[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            cnt2[c - 'a']++;
        }

        for (int i = 0; i < 26; ++i) {
            if (cnt1[i] != cnt2[i]) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] a) {

        ValidAnagram v = new ValidAnagram();

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        Boolean res = v.isAnagram(s, t);
        System.out.println(res);

    }

}

/*
 * Leetcode 242
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * 
 * Example 1:
 * 
 * Input: s = "anagram", t = "nagaram"
 * 
 * Output: true
 * Example 2:
 * 
 * Input: s = "rat", t = "car"
 * 
 * Output: false
 * 
 * Constraints:
 * 
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 */
