//This program is to display the Welcome message to Gambling Simulation Program.
//Use Case 1 is that As a Gambler, would start with a stake of $100 every day and bet $1 every game.
//Use Case 2 is that As a Gambler make $1 bet so either win or loose $1.
//Use Case 3 is that As a calculative Gambler if won or lost 50% of the stake, would resign for the day.
//Use Case 4 is that After 20 days of playing every day would like to know the total amount won or lost.
//Use Case 5 is that Each month would like to know the days won and lost and by how much.
//Use Case 6 is that to know Gambler's luckiest day when he won maximum and the unluckiest day when he lost maximum.

package com.gamblinsimulation;

import java.util.*;

public class GamblingSimulationProblem {

	// Default Constructor
	public GamblingSimulationProblem() {
		System.out.println("Welcome to Gambling Simulation Program");
		System.out.println();
		System.out.println("Gambler starts the game...");
	}

	// Declaring constants
	private final static int betMoney = 1;
	private final static int stakePerDay = 100;
	private final static double percentage = 0.5; // as it is given 50%
	private final static int count = 0;

	public static void main(String[] args) {

		// Initialize the object.
		GamblingSimulationProblem gambling = new GamblingSimulationProblem();
		System.out.println();
		System.out.println("Initial stake of Gambler is : " + stakePerDay);
		System.out.println("Initial betting money in gambling is : " + betMoney);
		System.out.println();
		startsGambling(gambling);

	}

	// Method for starting the game.
	public static void startsGambling(GamblingSimulationProblem gambling) {
		// Declaring variables
		Random random = new Random();
		int highestStake = (int) (stakePerDay + (stakePerDay * percentage));
		int lowestStake = (int) (stakePerDay - (stakePerDay * percentage));

		// Checking randomly if win or loose with the condition for 20 days for all
		// month.
		checkForMonth(highestStake, lowestStake, random);
	}

	public static void checkForMonth(int highestStake, int lowestStake, Random random) {
		String s;
		int maxDays;
		ArrayList bid = new ArrayList();
		for (int i = 1; i <= 12; i++) {

			if (i == 1) {
				s = "January";
				maxDays = 31;
				System.out.println("\n");
				System.out.println("For " + s + " :- ");
				System.out.println();
				checkingCondition(highestStake, lowestStake, random, s, maxDays, bid);
			} else if (i == 2) {
				s = "February";
				maxDays = 28;
				System.out.println("\n");
				System.out.println("For " + s + " :- ");
				System.out.println();
				checkingCondition(highestStake, lowestStake, random, s, maxDays, bid);
			} else if (i == 3) {
				s = "March";
				maxDays = 31;
				System.out.println("\n");
				System.out.println("For " + s + " :- ");
				System.out.println();
				checkingCondition(highestStake, lowestStake, random, s, maxDays, bid);
			} else if (i == 4) {
				s = "April";
				maxDays = 30;
				System.out.println("\n");
				System.out.println("For " + s + " :- ");
				System.out.println();
				checkingCondition(highestStake, lowestStake, random, s, maxDays, bid);
			} else if (i == 5) {
				s = "May";
				maxDays = 31;
				System.out.println("\n");
				System.out.println("For " + s + " :- ");
				System.out.println();
				checkingCondition(highestStake, lowestStake, random, s, maxDays, bid);
			} else if (i == 6) {
				s = "June";
				maxDays = 30;
				System.out.println("\n");
				System.out.println("For " + s + " :- ");
				System.out.println();
				checkingCondition(highestStake, lowestStake, random, s, maxDays, bid);
			} else if (i == 7) {
				s = "July";
				maxDays = 31;
				System.out.println("\n");
				System.out.println("For " + s + " :- ");
				System.out.println();
				checkingCondition(highestStake, lowestStake, random, s, maxDays, bid);
			} else if (i == 8) {
				s = "August";
				maxDays = 31;
				System.out.println("\n");
				System.out.println("For " + s + " :- ");
				System.out.println();
				checkingCondition(highestStake, lowestStake, random, s, maxDays, bid);
			} else if (i == 9) {
				s = "September";
				maxDays = 30;
				System.out.println("\n");
				System.out.println("For " + s + " :- ");
				System.out.println();
				checkingCondition(highestStake, lowestStake, random, s, maxDays, bid);
			} else if (i == 10) {
				s = "October";
				maxDays = 31;
				System.out.println("\n");
				System.out.println("For " + s + " :- ");
				System.out.println();
				checkingCondition(highestStake, lowestStake, random, s, maxDays, bid);
			} else if (i == 11) {
				s = "November";
				maxDays = 30;
				System.out.println("\n");
				System.out.println("For " + s + " :- ");
				System.out.println();
				checkingCondition(highestStake, lowestStake, random, s, maxDays, bid);
			} else {
				s = "December";
				maxDays = 31;
				System.out.println("\n");
				System.out.println("For " + s + " :- ");
				System.out.println();
				checkingCondition(highestStake, lowestStake, random, s, maxDays, bid);
			}
			System.out.println();

			// Printing all the data for every month
			printData(bid);
		}
	}

	public static void checkingCondition(int highestStake, int lowestStake, Random random, String s, int maxDays,
			ArrayList bid) {
		// Declaring few more variables.
		int totalWon = 0, totalLost = 0, totalDollars = 0;
		int maxProfit = 0, maxLoss = 0;
		for (int i = 1; i <= maxDays; i++) {
			int totalStake = stakePerDay;
			while (totalStake != highestStake && totalStake != lowestStake) {
				int bet = random.nextInt(2);
				switch (bet) {
				case 1:
					// Gambler Won
					totalStake = totalStake + betMoney;
					totalDollars = highestStake - stakePerDay;
					maxProfit++;
					break;
				default:
					// Gambler Lost
					totalStake = totalStake - betMoney;
					totalDollars = stakePerDay - lowestStake;
					maxLoss++;
					break;
				}
			}
			System.out.println("Gambler resigns for the day " + i + " for month " + s);
			System.out.println("Amount remaining at Gambler is : " + totalStake);
			System.out.println("Total won count by Gambler : " + maxProfit + " for day " + i + " for month " + s);
			System.out.println("Total lost count by Gambler : " + maxLoss + " for day " + i + " for month " + s);
			if (totalStake == highestStake) {
				System.out.println("Gambler won by $" + totalDollars + " for the day " + i + " for month " + s);
				totalWon = totalWon + totalDollars;
				bid.add(String.valueOf(maxProfit));
			} else if (totalStake == lowestStake) {
				System.out.println("Gambler lost by $" + totalDollars + " for the day " + i + " for month " + s);
				totalLost = totalLost + totalDollars;
				bid.add("-" + String.valueOf(maxLoss));
			}
			System.out.println();
			maxProfit = count;
			maxLoss = count;
		}
		if (totalWon == totalLost) {
			System.out.println("Gambler neither having total won or total lost in month " + s);
		} else if (totalWon > totalLost) {
			int total = totalWon - totalLost;
			System.out.println("Gambler having overall total won $" + total + " in month " + s);
		} else if (totalLost > totalWon) {
			int total = totalLost - totalWon;
			System.out.println("Gambler having overall total lost $" + total + " in month " + s);
		}
	}

	public static void printData(ArrayList bid) {
		int tempMax = 0, tempMin = 0, winDate = 0, lossDate = 0;
		int[] a = convertList(bid);
		String s;
		int max = a[0], min = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
				winDate = i;
			}
		}
		System.out.println("Gambler having max bid won " + max);
		if (winDate >= 0 && winDate < 31) {
			tempMax = winDate + 1;
			s = "January";
			System.out.println("Gambler's luckiest day is : " + tempMax + " of month " + s);
		} else if (winDate >= 31 && winDate < 59) {
			tempMax = (winDate - 31) + 1;
			s = "February";
			System.out.println("Gambler's luckiest day is : " + tempMax + " of month " + s);
		} else if (winDate >= 59 && winDate < 90) {
			tempMax = (winDate - 59) + 1;
			s = "March";
			System.out.println("Gambler's luckiest day is : " + tempMax + " of month " + s);
		} else if (winDate >= 90 && winDate < 120) {
			tempMax = (winDate - 90) + 1;
			s = "April";
			System.out.println("Gambler's luckiest day is : " + tempMax + " of month " + s);
		} else if (winDate >= 120 && winDate < 151) {
			tempMax = (winDate - 120) + 1;
			s = "May";
			System.out.println("Gambler's luckiest day is : " + tempMax + " of month " + s);
		} else if (winDate >= 151 && winDate < 181) {
			tempMax = (winDate - 151) + 1;
			s = "June";
			System.out.println("Gambler's luckiest day is : " + tempMax + " of month " + s);
		} else if (winDate >= 181 && winDate < 212) {
			tempMax = (winDate - 181) + 1;
			s = "July";
			System.out.println("Gambler's luckiest day is : " + tempMax + " of month " + s);
		} else if (winDate >= 212 && winDate < 243) {
			tempMax = (winDate - 212) + 1;
			s = "August";
			System.out.println("Gambler's luckiest day is : " + tempMax + " of month " + s);
		} else if (winDate >= 243 && winDate < 273) {
			tempMax = (winDate - 243) + 1;
			s = "September";
			System.out.println("Gambler's luckiest day is : " + tempMax + " of month " + s);
		} else if (winDate >= 273 && winDate < 304) {
			tempMax = (winDate - 273) + 1;
			s = "October";
			System.out.println("Gambler's luckiest day is : " + tempMax + " of month " + s);
		} else if (winDate >= 304 && winDate < 334) {
			tempMax = (winDate - 304) + 1;
			s = "November";
			System.out.println("Gambler's luckiest day is : " + tempMax + " of month " + s);
		} else if (winDate >= 334 && winDate < 365) {
			tempMax = (winDate - 334) + 1;
			s = "December";
			System.out.println("Gambler's luckiest day is : " + tempMax + " of month " + s);
		}
		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];
				lossDate = i;
			}
		}
		System.out.println("Gambler having max bid lost " + min);
		if (lossDate >= 0 && lossDate < 31) {
			tempMin = lossDate + 1;
			s = "January";
			System.out.println("Gambler's unluckiest day is : " + tempMin + " of month " + s);
		} else if (lossDate >= 31 && lossDate < 59) {
			tempMin = (lossDate - 31) + 1;
			s = "February";
			System.out.println("Gambler's unluckiest day is : " + tempMin + " of month " + s);
		} else if (lossDate >= 59 && lossDate < 90) {
			tempMin = (lossDate - 59) + 1;
			s = "March";
			System.out.println("Gambler's unluckiest day is : " + tempMin + " of month " + s);
		} else if (lossDate >= 90 && lossDate < 120) {
			tempMin = (lossDate - 90) + 1;
			s = "April";
			System.out.println("Gambler's unluckiest day is : " + tempMin + " of month " + s);
		} else if (lossDate >= 120 && lossDate < 151) {
			tempMin = (lossDate - 120) + 1;
			s = "May";
			System.out.println("Gambler's unluckiest day is : " + tempMin + " of month " + s);
		} else if (lossDate >= 151 && lossDate < 181) {
			tempMin = (lossDate - 151) + 1;
			s = "June";
			System.out.println("Gambler's unluckiest day is : " + tempMin + " of month " + s);
		} else if (lossDate >= 181 && lossDate < 212) {
			tempMin = (lossDate - 181) + 1;
			s = "July";
			System.out.println("Gambler's unluckiest day is : " + tempMin + " of month " + s);
		} else if (lossDate >= 212 && lossDate < 243) {
			tempMin = (lossDate - 212) + 1;
			s = "August";
			System.out.println("Gambler's unluckiest day is : " + tempMin + " of month " + s);
		} else if (lossDate >= 243 && lossDate < 273) {
			tempMin = (lossDate - 243) + 1;
			s = "September";
			System.out.println("Gambler's unluckiest day is : " + tempMin + " of month " + s);
		} else if (lossDate >= 273 && lossDate < 304) {
			tempMin = (lossDate - 273) + 1;
			s = "October";
			System.out.println("Gambler's unluckiest day is : " + tempMin + " of month " + s);
		} else if (lossDate >= 304 && lossDate < 334) {
			tempMin = (lossDate - 304) + 1;
			s = "November";
			System.out.println("Gambler's unluckiest day is : " + tempMin + " of month " + s);
		} else if (lossDate >= 334 && lossDate < 365) {
			tempMin = (lossDate - 334) + 1;
			s = "December";
			System.out.println("Gambler's unluckiest day is : " + tempMin + " of month " + s);
		}
	}

	public static int[] convertList(ArrayList bid) {
		Object[] arr = bid.toArray();
		int[] a = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			a[i] = Integer.parseInt((String) arr[i]);
		}
		return a;
	}

}