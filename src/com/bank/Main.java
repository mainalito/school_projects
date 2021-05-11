package com.bank;


import com.bank.classes.Bank;
import com.bank.service.bankService;

public class Main {

    public static void main(String[] args) {
	// write your code here
        bankService bs= new bankService();
        System.out.println(bs.getDetails());
    }
}
