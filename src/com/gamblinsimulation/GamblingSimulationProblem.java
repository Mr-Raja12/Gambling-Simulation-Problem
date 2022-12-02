package com.gamblinsimulation;
import java.util.Random;
/**
 * @author Raja 
 * This program is to display the Welcome message to Gambling Simulation Program.
 * Use Case 1 is that As a Gambler, would start with a stake of $100 every day and bet $1
 *  every game.
 *  As a calculative Gambler if won or lost 50% of the stake, would resign for the day.
 */
public class GamblingSimulationProblem {
    /**
     * Default construction
     */
    public GamblingSimulationProblem() {
        System.out.println("Welcome to Gambling Simulation Program");
        System.out.println();
        System.out.println("Gambler starts the game...");
    }

    /**
     * Declaring constants
     */
    final int betMoney = 1;
    final int stakePerDay = 100;
    final double percentage = 0.5;   //as it is given 50%

    public static void main(String[] args) {

        /**
         * Initialize the object.
         */
        GamblingSimulationProblem gambling = new GamblingSimulationProblem();
        System.out.println();
        System.out.println("Initial stake of Gambler is : "+gambling.stakePerDay);
        System.out.println("Initial betting money in gambling is : "+gambling.betMoney);
        startsGambling(gambling);

    }

     /**
      * Method for starting the game.
      * @param gambling
      */
    public static void startsGambling(GamblingSimulationProblem gambling) {
        //Declaring variables
        Random random = new Random();
        int totalStake = 0;
        totalStake = totalStake + gambling.stakePerDay;
        System.out.println(gambling.percentage);
        int highestStake = (int) (totalStake+(totalStake * gambling.percentage));
        int lowestStake = (int) (totalStake-(totalStake * gambling.percentage));

        /**
         * Checking randomly if win or loose with the condition.
         */
        totalStake = checkingCondition(gambling,random,totalStake,highestStake,lowestStake);
        System.out.println("Gambler resigns for the day.");
        System.out.println("Amount remaining at Gambler is : "+totalStake);

    }

    public static int checkingCondition(GamblingSimulationProblem gambling, Random random, int totalStake, int highestStake, int lowestStake) {
        while (totalStake != highestStake && totalStake != lowestStake)
        {
            int bet = random.nextInt(2);
            switch (bet) {
                case 1:
                    System.out.println("Gambler won the bet.");
                    totalStake = totalStake + gambling.betMoney;
                    break;
                default:
                    System.out.println("Gambler lost the bet.");
                    totalStake = totalStake - gambling.betMoney;
                    break;
            }
        }
        return totalStake;
    }
}