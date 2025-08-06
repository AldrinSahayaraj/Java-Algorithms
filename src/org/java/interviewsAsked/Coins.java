package org.java.interviewsAsked;

import java.util.Arrays;

public class Coins {
    public static int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int obtainable = 0;
        int numNeeded = 0;
        int coinIdx = 0;
        while (obtainable < target) {
            int nextToObtain = obtainable + 1;
            if (coinIdx < coins.length && coins[coinIdx] <= nextToObtain) {
                obtainable += coins[coinIdx];
                coinIdx++;
            } else {
                obtainable += nextToObtain;
                numNeeded++;
            }
        }
        return numNeeded;
    }

    public static void main(String[] args) {
        minimumAddedCoins(new int[] {1,4,10,5,7,19},19);
    }
}
