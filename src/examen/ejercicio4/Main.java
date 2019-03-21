package examen.ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, String> Agenda = new HashMap<>();

		Scanner sc = new Scanner(System.in);
//		sc.useDelimiter("[\\s:-]");
		String s ;
		String[] partes;
		int pos;
		int pos2;
		
		do {
		System.out.println("escribe");
		 s = sc.next().toLowerCase();
		 pos=s.indexOf("-");
		 pos2=s.indexOf("buscar:");
		 if(!(pos==-1)) {
			 partes= s.split("-");
			 if(Agenda.containsKey(partes[0])){
					 Agenda.put(partes[0], partes[1]);
				}else {
					Agenda.put(partes[0], partes[1]);
				}
			 
		 }else if(!(pos2==-1)){
			 partes= s.split(":");
			 System.out.println( Agenda.get(partes[1]));
		 }
		 
		
		}while(!s.equalsIgnoreCase("fin"));


	}

}
