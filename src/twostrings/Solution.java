package twostrings;

import java.util.*;

/**
 * @link https://www.hackerrank.com/challenges/two-strings
 */
public class Solution {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            if (solve(s1, s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


    public static boolean solve(String s1, String s2) {

        boolean flag = false;
        for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            if (s1.indexOf(c) > -1 && s2.indexOf(c) > -1)
                flag = true;
        }

        return flag;
    }

}