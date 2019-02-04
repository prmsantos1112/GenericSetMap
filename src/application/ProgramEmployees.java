package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employees;

public class ProgramEmployees {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Full File Path: ");
		String path = scanner.nextLine();
		System.out.println();

		try (BufferedReader buffered = new BufferedReader(new FileReader(path))) {

			List<Employees> list = new ArrayList<>();
			
			String line = buffered.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employees(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = buffered.readLine();

			}
			
			System.out.print("Enter Salary: ");
			double salary = scanner.nextDouble();
			System.out.println();
			List<String> emails = list.stream()
					.filter(x -> x.getSalary() > salary)
					.map(x -> x.getEmail())		
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of People Whose Salary is More Than: " + String.format("%.2f", salary) + ":");			
			emails.forEach(System.out::println);
			System.out.println();
			
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
					
			System.out.println("Sum of Salary of People Whose Name Starts With 'M': " + String.format("%.2f", sum));					
			System.out.println();
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());			

		}
		scanner.close();
	}
}
