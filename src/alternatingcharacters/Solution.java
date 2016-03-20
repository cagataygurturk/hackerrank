package alternatingcharacters;

import java.util.Scanner;

/**
 * @link https://www.hackerrank.com/challenges/alternating-characters
 */
public class Solution {

    public static int minDeletionsRequired(String s) {
        int minDeletion = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String curChar = s.substring(i, i + 1);
            String nextChar = s.substring(i + 1, i + 2);
            if (curChar.equals(nextChar)) {
                minDeletion++;
            }
        }
        return minDeletion;
    }

    private static void process(int numberOfStrings, String[] inputStrs) {
        int repeations = 0;
        while (repeations < numberOfStrings) {
            System.out.println(minDeletionsRequired(inputStrs[repeations++]));
        }
    }

    private static String[] acceptInput(Scanner scanner, int numberOfStrings) {
        String[] inputStrs = new String[numberOfStrings];
        int repeations = 0;
        while (repeations < numberOfStrings) {
            inputStrs[repeations++] = scanner.next();
        }
        return inputStrs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = scanner.nextInt();

        String[] inputStrs = acceptInput(scanner, numberOfStrings);

        process(numberOfStrings, inputStrs);

        scanner.close();
    }
}

