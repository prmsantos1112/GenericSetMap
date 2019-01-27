package application;

import java.util.Scanner;
import services.PrintServiceString;


public class ProgramPrintServiceString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PrintServiceString printservice = new PrintServiceString();

		System.out.print("How many Values ? ");
		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {
			String value = sc.next();
			printservice.addValue(value);
		}

		printservice.print();
		System.out.println("First: " + printservice.first());

		sc.close();
	}
}
