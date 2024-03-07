package com.learning.core.day3;

import java.util.Scanner;

public class D03P08 {
	public static int minDeletionsToPalindrome(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return s.length() - dp[0][s.length() - 1];
    }

    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        int deletions = minDeletionsToPalindrome(input);
        System.out.println("Output: " + deletions);

    }

}
