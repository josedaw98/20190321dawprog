package examen.ejercicio1;

import java.awt.Color;

public abstract class Figura implements Comparable<Figura> {
	private Color color = Color.blue;
	private int Posicion;
	private Boolean rellenas = true;
	
	
	
	@Override
	public String toString() {
		return "Figura [color=" + color + ", Posicion=" + Posicion + ", rellenas=" + rellenas + "]";
	}

	
	
	public Figura( int posicion, Boolean rellenas) {
		
		Posicion = posicion;
		this.rellenas = rellenas;

	}
	
	public Figura(Color color, int posicion, Boolean rellenas ) {
		this.color = color;
		Posicion = posicion;
		this.rellenas = rellenas;

	}
	public Figura( int posicion) {
		
		Posicion = posicion;

	}
	
	public Figura( Color color,int posicion) {
		
		this.color=color;
		Posicion = posicion;
		
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getPosicion() {
		return Posicion;
	}
	public void setPosicion(int posicion) {
		Posicion = posicion;
	}
	public Boolean getRellenas() {
		return rellenas;
	}
	public void setRellenas(Boolean rellenas) {
		this.rellenas = rellenas;
	}
	
	
	@Override
	public int compareTo(Figura f) {
		if (getarea() < f.getarea())
			return -1;
		else if (getarea() > f.getarea())
			return 1;
		return 0;
	}



	protected abstract int getarea();



	protected abstract int getperimetro();
	

}
