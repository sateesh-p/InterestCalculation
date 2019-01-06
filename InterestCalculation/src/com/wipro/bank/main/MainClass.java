package com.wipro.bank.main;

import java.util.Scanner;

import com.wipro.bank.service.BankService;

public class MainClass {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int tenure;
		float principal;
		int age;
		String gender;
		tenure=in.nextInt();
		principal=in.nextFloat();
		age=in.nextInt();
		gender=in.next();
		BankService b=new BankService();
		b.calculate(principal,tenure,age,gender);
	}

}
