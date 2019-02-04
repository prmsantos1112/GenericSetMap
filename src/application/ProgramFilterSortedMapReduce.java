package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.ProductFilterSortedMapReduce;

public class ProgramFilterSortedMapReduce {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Full File Paph: ");
		String path = scanner.nextLine();
		System.out.println();

		try (BufferedReader buffered = new BufferedReader(new FileReader(path))) {

			List<ProductFilterSortedMapReduce> list = new ArrayList<>();

			String line = buffered.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new ProductFilterSortedMapReduce(fields[0], Double.parseDouble(fields[1])));
				line = buffered.readLine();
			}
			
			// Encontrar o Preço Médio de todos os Produtos da Lista;
			
			double avg = list.stream()
					.map(product -> product.getPrice())
					.reduce(0.0, (x,y) -> x + y) / list.size();
			
			// Imprimir na Tela;
			
			System.out.println("Average Price: " + String.format("%.2f", avg));
			System.out.println();
			
			// Nome dos Produtos com Preços abaixo da Média: Ordenados ordem Decrescente;
			
			Comparator<String> compare = (string1, string2) -> string1.toUpperCase().compareTo(string2.toUpperCase());
					
			List<String> names = list.stream()
					.filter(product -> product.getPrice() < avg)
					.map(product -> product.getName())
					.sorted(compare.reversed())
					.collect(Collectors.toList());
			names.forEach(System.out::println);
			

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
		scanner.close();
	}
}
  