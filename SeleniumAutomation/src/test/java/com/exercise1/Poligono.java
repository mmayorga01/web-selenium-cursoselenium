package com.exercise1;

public abstract class Poligono {
	
	private int numLados;
	//Constructor default
	public Poligono() {
		
	}

	//Constructor Lados
		public Poligono (int numLados) {
		this.numLados = numLados;
		}
	
	//Encapsular Setter y getter
	public void setNumLados(int numLados) {
	this.numLados = numLados;
	}
	
	public int getNumLados() {
	return numLados;
	}
	
	//Numero de Lados
	@Override 
	public String toString() {
		return "Número de lados" +numLados;
			}
	//Metodo de abstraccion
	public abstract double area();
	public abstract double perimetro();
	
	
	

}

