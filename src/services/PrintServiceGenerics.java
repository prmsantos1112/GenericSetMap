package services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceGenerics<TypeSafety> {
	
	List<TypeSafety> list = new ArrayList<>();
	
	public void addValue(TypeSafety value) {
		list.add(value);
	}
	
	public TypeSafety first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is Empty");
		}
		return list.get(0);		
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		
		for (int i = 1; i < list.size(); i ++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}

}
