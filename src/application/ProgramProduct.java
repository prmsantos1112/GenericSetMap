package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;



public class ProgramProduct {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		String path = "C:\\Users\\prmsa\\eclipse-workspace_2018-09\\Documento_3.txt";

		try (BufferedReader bufered = new BufferedReader(new FileReader(path))) {

			String line = bufered.readLine();
			while (line != null) {
				String [] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = bufered.readLine();
			}

			Product var = CalculationService.maximo(list);
			System.out.print("Most Expensive: ");
			System.out.println(var);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
