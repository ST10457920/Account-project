package com.example.login;

import java.util.Scanner;

public class TestClassOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Create a new Username: ");
		String UserName = scanner.next();
		System.out.print("Create a new Password: ");
		String password = scanner.next();
		Login acc = new Login(UserName,password);
	}

}
