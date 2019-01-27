package application;

import java.util.Scanner;
import services.PrintService;


public class ProgramPrintService {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PrintService printservice = new PrintService();

		System.out.print("How many Values ? ");
		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {
			int value = sc.nextInt();
			printservice.addValue(value);
		}

		printservice.print();
		System.out.println("First: " + printservice.first());

		sc.close();
	}
}
