package application;

import entities.Client;

public class ProgramHaschCodeEquals {

	public static void main(String[] args) {
		
		
		Client cliente = new Client("Paulo", "paulo@gmail.com");
		Client cliente_1 = new Client("Paulo", "paulo@gmail.com");
		
		System.out.println(cliente.hashCode());
		System.out.println(cliente_1.hashCode());
		System.out.println(cliente.equals(cliente_1));
		System.out.println(cliente == cliente_1);
		System.out.println();
		System.out.println("--------------------");
		System.out.println("--------------------");
		String a = "Paulo Ricardo Santos"; 
		String b = "Paulo Ricardo Santos";
		
		System.out.println(a.equals(b));
		System.out.println();
		System.out.println(a.hashCode()); 
		System.out.println(b.hashCode());
		System.out.println("--------------------");
		System.out.println("--------------------");
		
		String s1 = "Teste";
		String s2 = "Teste";
		System.out.println(s1 == s2);
		
		String s3 = new String ("Teste");
		String s4 = new String ("Teste");		
		System.out.println();		
		System.out.println(s3 == s4);
		System.out.println();	
		System.out.println("--------------------");
		
				

	}

}
