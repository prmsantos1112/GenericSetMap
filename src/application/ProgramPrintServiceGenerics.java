package application;

import java.util.Scanner;
import services.PrintServiceGenerics;


public class ProgramPrintServiceGenerics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		// Para Inteiro alterar String para Integer;
		PrintServiceGenerics<String> printservice = new PrintServiceGenerics<>();

		System.out.print("How many Values ? ");
		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {
			String value = sc.next();
			printservice.addValue(value);
		}

		printservice.print();
		String x = printservice.first();
		System.out.println("First: " + x);

		sc.close();
	}
}
