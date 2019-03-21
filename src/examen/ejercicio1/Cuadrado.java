package examen.ejercicio1;

import java.awt.Color;

public class Cuadrado extends Figura {
	
	private int LongitudLado;
	private int area;
	private int perimetro;



	public int getperimetro() {
		perimetro =(int) LongitudLado*4;
		return perimetro;
	}
	
	public int getarea() {
		area=(int) LongitudLado*LongitudLado;
		return area;
	}
	

	public int getLongitudLado() {
		return LongitudLado;
	}

	public void setLongitudLado(int longitudLado) {
		LongitudLado = longitudLado;
	}

	public Cuadrado(Color color, int posicion, Boolean rellenas, int LongitudLado) {
		super(color, posicion, rellenas);
		// TODO Auto-generated constructor stub
		this.LongitudLado=LongitudLado;
	}

	public Cuadrado(Color color, int posicion, int LongitudLado) {
		super(color, posicion);
		// TODO Auto-generated constructor stub
		this.LongitudLado=LongitudLado;
	}

	public Cuadrado(int posicion, Boolean rellenas, int LongitudLado) {
		super(posicion, rellenas);
		// TODO Auto-generated constructor stub
		this.LongitudLado=LongitudLado;
	}

	public Cuadrado(int posicion, int LongitudLado) {
		super(posicion);
		// TODO Auto-generated constructor stub
		this.LongitudLado=LongitudLado;
	}


	

}
