package level1.i_love_lance_janice;

public class Solution {
    public static String solution(String s) { 
        // Your code goes here.
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            sb.append(( c >= 'a' && c <= 'z' ) ? (char)((int)('z' - c + 'a')): c);
        }
        return sb.toString();
    }
}