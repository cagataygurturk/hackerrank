package gameofthrones;

import java.util.*;

/**
 * @link https://www.hackerrank.com/challenges/game-of-thrones
 */
public class Solution {

    public static boolean solve(String input) {
        char[] chars = input.toCharArray();

        int bits = 0;

        int strLen = chars.length;
        for (int i = 0; i < strLen; bits = bits ^ (1 << (chars[i++] - 'a'))) {
        }

        return (bits & (bits - (strLen & 1))) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (solve(input) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}