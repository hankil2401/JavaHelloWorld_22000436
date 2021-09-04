package com.example.lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hello World!!!\n");
		System.out.print("이름 입력 : ");
		String name = s.next();
		System.out.println("[" + name + "]님 환영합니다~");
		
		System.out.print("Please enter your year of birth (yyyy): ");
		int birth = s.nextInt();
		int age = 2021-birth+1;
		
		if(age>15) {
			System.out.println("Welcome to our shop!");
		}
		else {
			System.out.println("That way please, there is area for kids over there!");
		}
		
		System.out.println("\n\n\nI struggle with this easy and basic assignment for hours just because i let the path of the project in Korean... T.T");
	}

}
