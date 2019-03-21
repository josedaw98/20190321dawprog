package examen.ejercicio2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import examen.ejercicio1.Circulo;
import examen.ejercicio1.ComparadorRellenoPerimetro;
import examen.ejercicio1.Cuadrado;
import examen.ejercicio1.Figura;
import examen.ejercicio1.Rectangulo;

public class Main {

	public static void main(String[] args) {
		
		
		//Almacenar en un hashset
		HashSet<Figura> Almacen = new HashSet<>();
		Almacen.add(new Circulo(Color.RED, 21, 10, 23, 7));
		Almacen.add(new Rectangulo(Color.blue, 11, false, 15, 20));
		Almacen.add(new Cuadrado(Color.black, 17, true, 19));
		
		
		//comprobar ordenador con un arraylist
		
		ArrayList<Figura> Figuras = new ArrayList<>();
		Figuras.add(new Circulo(Color.RED, 21, true, 7));
		Figuras.add(new Rectangulo(Color.blue, 11, false, 15, 20));
		Figuras.add(new Cuadrado(Color.black, 17, true, 19));
		
		mostrarLista(Figuras);
		Collections.sort(Figuras);
		mostrarLista(Figuras);
		Collections.sort(Figuras, Collections.reverseOrder());
		mostrarLista(Figuras);
		Collections.sort(Figuras, new ComparadorRellenoPerimetro());
		mostrarLista(Figuras);
		Collections.sort(Figuras, Collections.reverseOrder(new ComparadorRellenoPerimetro()));
		mostrarLista(Figuras);

		
		
		
	}
	//CREAMOS UN METODO PAAR NO COPIAR TANTO CODIGO AL MOSTRAR
	public static void mostrarLista(List<Figura> Figuras) {
		Iterator<Figura> i = Figuras.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
