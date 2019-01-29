package application;


import java.util.ArrayList;
import java.util.List;
import entities.Rectangle;
import entities.Circle;
import entities.Shape;

public class ProgramDelimited {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.5));
		myCircles.add(new Circle(3.5));
		
		System.out.println("Total da Área: " + totalArea(myCircles));

	}
	// Alterando para lista de qualquer tipo de Shape; (List<? extends Shape> list)
	// Somente adicinando Circle na lista se formos adicionar Rectangle ocorre erro;
	
	public static double totalArea(List<? extends Shape> list) { 
	 // list.add(new Rectangle(3.0, 4.0));	// Incompatível com rectangle e sim com circulos.
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}	
}
