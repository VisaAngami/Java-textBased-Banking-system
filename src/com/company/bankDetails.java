package com.company;

import java.util.Scanner;

public class bankDetails {

	Scanner input = new Scanner(System.in);
	String user;
	int userInput;
	int cID = 0;
	double[] accountBalances = new double[250]; //cID Total
	String[] accountNames = new String[250];

	public bankDetails() {

		try {
		} catch (Exception e) {
			for (; true; ) {

				System.out.print("Enter Option:");
				userInput = input.nextInt();
				System.out.println("--------------------------------------------");

				if (userInput == 1) {


					System.out.println("|Customer Account Menu|\n");
					System.out.println("(1) Enter Account Holder Name:");
					input.nextLine();
					String name = input.nextLine();
					accountNames[cID] = name;
					System.out.println("(2) Enter Account Balance:");
					System.out.print("$");
					double balance = input.nextDouble();
					accountBalances[cID] = balance;
					System.out.println("--------------------------------------------");
					System.out.println("Customer Account Name:" + name
							+ "\nAccount Balance:" + balance
							+ "\nCustomer ID:" + cID);
					cID = cID + 1;
					System.out.println("--------------------------------------------");


				} else if (userInput == 2) {

					System.out.println("|Change Customer Name Menu|\n");
					System.out.println("(1) Please Enter Customer ID To Change Name:");
					int index = input.nextInt();
					System.out.println("(2) Please Enter Customer's New Name:");
					input.nextLine();
					accountNames[index] = input.nextLine();
					System.out.println("New Customer Name is:" + accountNames[index]);
					System.out.println("--------------------------------------------");

				} else if (userInput == 3) {
					System.out.println("|Customer Account Balance Menu|\n");
					System.out.print("(1) Please Enter Customer ID To Check Their Balance:");
					int index = input.nextInt();
					double balance = accountBalances[index];
					System.out.println("(2) Available Balance in Account:$" + balance);
					System.out.println("--------------------------------------------");

				} else if (userInput == 4) {
					System.out.println("|Modify Account Balance Menu|\n");
					System.out.println("(1) Please Enter Customer ID To Modify Their Balance:");
					int index = input.nextInt();
					System.out.println("(2) Please Enter New Balance:");
					accountBalances[index] = input.nextDouble();
					System.out.println("New Available Balance:" + "$" + accountBalances[index]);
					System.out.println("--------------------------------------------");

				} else if (userInput == 5) {
					System.out.println("|Bank Account Summary Menu|\n");
					double Total = 0;
					for (int i = 0; i < cID; ++i) {
						Total += accountBalances[i];
						System.out.println(accountNames[i] + " has $" + accountBalances[i] + " in their Account.");
					}
					System.out.println("-----------------------------------------------------------");
					System.out.println("In Total There is $" + Total + " Amount Available In the Bank");
					System.out.println("-----------------------------------------------------------");

				} else if (userInput == 0) {
					System.exit(0);

				} else {
					System.out.println("ERROR: Invalid Input");
				}
			}
		}System.out.println("e");
	}
}