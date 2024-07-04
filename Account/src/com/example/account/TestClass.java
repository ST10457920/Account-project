package com.example.account;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter first name: ");
	    String FirstName = scanner.next();
	    System.out.print("Enter last name: ");
	    String LastName = scanner.next();
	    System.out.print("Create username: ");
	    String UserName = scanner.next();
	    System.out.print("Create password: ");
	    String password = scanner.next();
	    System.out.print("\nEnter username: ");
	    String Username = scanner.next();
	    System.out.print("Enter password: ");
	    String Password = scanner.next(); 
	    Account acc = new Account(UserName,password,FirstName,LastName,Username,Password);
	    acc.checkUserName();
	    acc.checkPasswordComplexity();
        acc.registerUser();
        acc.LoginUser();
        acc.returnLoginStatus();
}}