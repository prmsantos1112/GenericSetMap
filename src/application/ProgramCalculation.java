package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import services.CalculationService;

public class ProgramCalculation {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		String path = "C:\\Users\\prmsa\\eclipse-workspace_2018-09\\Documento_2.txt";
		
		try (BufferedReader bufered = new BufferedReader(new FileReader(path))) {
			
			String line = bufered.readLine();
			while (line != null) {
				list.add(Integer.parseInt(line));
				line = bufered.readLine();
			}
			
			Integer var = CalculationService.maximo(list);
			System.out.print("Max: ");
			System.out.println(var);
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}
 