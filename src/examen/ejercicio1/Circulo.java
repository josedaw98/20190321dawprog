package examen.ejercicio1;

import java.awt.Color;

public class Circulo extends Figura {
	
	private int radio;
	
	private int area;
	private int perimetro;



	public int getperimetro() {
		perimetro =(int) (2*3.14*radio);
		return perimetro;
	}
	
	public int getarea() {
		area=(int) (3.14*(radio*radio));
		return area;
	}



	public void setArea(int area) {
		this.area = area;
	}



	public Circulo(Color color, int posicion, Boolean rellenas, int radio) {
		super(color, posicion, rellenas);
		// TODO Auto-generated constructor stub
		this.radio=radio;
	}



	public Circulo(Color color, int posicion, int area, int perimetro, int radio) {
		super(color, posicion);
		// TODO Auto-generated constructor stub
		this.radio=radio;
	}



	public Circulo(int posicion, Boolean rellenas, int radio) {
		super(posicion, rellenas);
		// TODO Auto-generated constructor stub
		this.radio=radio;
	}



	public Circulo(int posicion, int radio) {
		super(posicion);
		// TODO Auto-generated constructor stub
		this.radio=radio;
	}



	public int getRadio() {
		return radio;
	}



	public void setRadio(int radio) {
		this.radio = radio;
	}





}
