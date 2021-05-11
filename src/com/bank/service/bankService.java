package com.bank.service;

import com.bank.classes.Bank;
import com.bank.classes.Error;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bankService {

    public Bank getDetails() throws InputMismatchException {
        Bank bank = new Bank();
        System.out.println("=========================================================================");
        System.out.println("\t\tLOGIN TO OUR ATM MACHINE");
        System.out.println("Please enter your account_number: ");
        Scanner myobj = new Scanner(System.in);
        String account_number = myobj.nextLine();
        bank.setAccount_number(account_number);

        System.out.println("Please enter your pin for security: ");
        String pin = myobj.nextLine();
        int counter = 3;
        bank.setPin(pin);
        while (!account_number.equals("100100") && !pin.equals("maina")) {
            Error error = new Error();
            error.setDesp("invalid pin or password");
            System.out.println(error);
            if (counter >=0) {
                System.out.println("Please enter your account_number: ");
                account_number = myobj.nextLine();
                bank.setAccount_number(account_number);
                System.out.println("Please enter your pin for security: ");
                pin = myobj.nextLine();
                bank.setPin(pin);
                System.out.println("You have been left with "+ counter-- + " chances");
            } else {
                System.out.println("wait for 1 minute before proceeding.");
                System.exit(1);
            }


        }
        System.out.println("Do you wish to continue y/n ?");
        String resp = myobj.nextLine();


        int totalamount = 0;
        System.out.println("=========================================================================");
        System.out.println("\t\t1. Deposit money");
        System.out.println("\t\t2. Check amount of money");
        System.out.println("\t\t3. Withdraw money");
        System.out.println("\t\t4. exit");

        while (resp.equals("y")) {
            String choice;
            int amnt;
            System.out.println("Choose a number: ");
            choice = myobj.nextLine();
            switch (choice) {
                //deposit money
                case "1":
                    System.out.println("How much money do you want to deposit");
                    amnt = myobj.nextInt();
                    if (amnt > 0) {
                        totalamount = totalamount + amnt;
                    } else {
                        System.out.println("invalid number");
                        throw new InputMismatchException("invalid token");
                    }

                    break;
                case "2":
                    System.out.println("amount is " + totalamount);
                    break;
                case "3":
                    System.out.println("how much do you want to withdraw");
                    amnt = myobj.nextInt();
                    if (amnt > totalamount) {
                        System.out.println("insufficient balance");

                    } else {
                        totalamount = totalamount - amnt;
                    }

                    break;
                case "4":
                    break;

            }
        }
        return bank;
    }

}
