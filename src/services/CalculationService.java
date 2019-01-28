package services;

import java.util.List;

public class CalculationService {

	public static <Type extends Comparable<? super Type>> Type maximo(List<Type> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List Can't be empty");
		}
		Type maximo = list.get(0);
		for (Type item : list) {
			if (item.compareTo(maximo) > 0) {
				maximo = item;
			}
		}
		return maximo;
	}

}
