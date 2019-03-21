package examen.ejercicio3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> SinRepeteir = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("numero de elementos a escribir");
		int r = sc.nextInt();
		String s;
		
		for(int i=0;i<=r;i++) {
			s =sc.next();
			String []partes =s.split(" ");
				for(int t=0;t<partes.length;t++) {
					if(!SinRepeteir.contains(partes[t])) {
						SinRepeteir.add(partes[t]);
					}
				}
		}
		
		Iterator<String> i = SinRepeteir.iterator();
		System.out.println("resultao");
		while (i.hasNext()) {
			System.out.print(" ");
			System.out.print(i.next());
			System.out.print(" ");
		}
	}

}
