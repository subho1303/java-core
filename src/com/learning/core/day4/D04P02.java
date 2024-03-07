package com.learning.core.day4;

import java.util.Scanner;

public class D04P02 {
	private String pname;
    private float c1;
    private float c2;
    private float c3;
    private float avgRating;
    private String coins;

    public D04P02(String playerName, float c1, float c2, float c3) {
        this.pname = playerName;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avgRating = (c1 + c2 + c3) / 3;
        this.coins = calculateCoins();
    }

    private String calculateCoins() {
        if (avgRating < 2) {
            throw new NotEligibleException("Not Eligible");
        } else if (avgRating >= 7) {
            return "Gold";
        } else if (avgRating >= 5) {
            return "Silver";
        } else {
            return "Bronze";
        }
    }

    public String getPlayerName() {
        return pname;
    }

    public float getAvgRating() {
        return avgRating;
    }

    public String getCoins() {
        return coins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player name:");
        String playerName = scanner.nextLine();
        System.out.println("Enter critic 1 rating:");
        float c1 = scanner.nextFloat();
        System.out.println("Enter critic 2 rating:");
        float c2 = scanner.nextFloat();
        System.out.println("Enter critic 3 rating:");
        float c3 = scanner.nextFloat();

        try {
            D04P02 player = new D04P02(playerName, c1, c2, c3);
            System.out.println("Player Name: " + player.getPlayerName());
            System.out.println("Average Rating: " + player.getAvgRating());
            System.out.println("Coins: " + player.getCoins());
        } catch (NotEligibleException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}

class NotEligibleException extends RuntimeException {
    public NotEligibleException(String message) {
        super(message);
    }
}