package examen.ejercicio1;

import java.awt.Color;

public class Rectangulo extends Figura {
	
	private int longitudBase;
	private int LongitudAltura;
	private int area;
	private int perimetro;



	public int getperimetro() {
		perimetro =(int) (longitudBase*2) +(LongitudAltura*2) ;
		return perimetro;
	}
	
	public int getarea() {
		area=(int) longitudBase *LongitudAltura;
		return area;
	}
	
	
	public Rectangulo(Color color, int posicion, Boolean rellenas, int longitudBase, int LongitudAltura) {
		super(color, posicion, rellenas);
		this.LongitudAltura=LongitudAltura;
		this.longitudBase=longitudBase;
	}
	public Rectangulo(Color color, int posicion, int longitudBase, int LongitudAltura) {
		super(color, posicion);
		// TODO Auto-generated constructor stub
		this.LongitudAltura=LongitudAltura;
		this.longitudBase=longitudBase;
	}
	public Rectangulo(int posicion, Boolean rellenas,  int longitudBase, int LongitudAltura) {
		super(posicion, rellenas);
		// TODO Auto-generated constructor stub
		this.LongitudAltura=LongitudAltura;
		this.longitudBase=longitudBase;
	}
	public Rectangulo(int posicion, int longitudBase, int LongitudAltura) {
		super(posicion);
		// TODO Auto-generated constructor stub
		this.LongitudAltura=LongitudAltura;
		this.longitudBase=longitudBase;
	}
	
	
	
	
	public int getLongitudBase() {
		return longitudBase;
	}
	public void setLongitudBase(int longitudBase) {
		this.longitudBase = longitudBase;
	}
	public int getLongitudAltura() {
		return LongitudAltura;
	}
	public void setLongitudAltura(int longitudAltura) {
		LongitudAltura = longitudAltura;
	}
	



}
