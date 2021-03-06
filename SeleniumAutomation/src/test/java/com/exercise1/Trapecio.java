package com.exercise1;

public class Trapecio extends Poligono{
	private double lado1,lado2,lado3, lado4;
	private double basema,baseme, altura1;
	//Constructor Defaul
	public Trapecio() {
		
	}
	
	//Constructor Perimetro
		public Trapecio(int lado1,int lado2,int lado3, int lado4) {
			super(4);
			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
			this.lado4 = lado4;
		}
	
		//Constructor Area
		public Trapecio (double base1,double base2, double altura) {
			super(4);
			this.basema=base1;
			this.baseme=base2;
			this.altura1= altura;
		}			
		
		
		public void setLado1(double lado1) {
			this.lado1 = lado1;
			
		}
		
		public double getLado1() {
			return lado1;
		}
		
		public void setLado2(double lado2) {
			this.lado2 = lado2;
			
		}
		
		public double getLado2() {
			return lado2;
		}
		
		public void setLado3(double lado3) {
			this.lado3 = lado3;
			
		}
		
		public double getLado3() {
			return lado3;
		}
		
		public void setLado4(double lado4) {
			this.lado4 = lado4;
			
		}
		
		public double getLado4() {
			return lado4;
		}
		
		//Metodos
		@Override
		public String toString() {
			String message = "Trapecio\n"+ super.toString()+
					" \nLado1 ="+lado1+"Lado2="+lado2+"Lado3="+lado3+"Lado4="+lado4;
			return message;
		}
		
		@Override
		public double area() {
			return((basema+baseme) * altura1)/2;
				}
		
		@Override
		public double perimetro() {
		return lado1+lado2+lado3+lado4;
	}
		
		
}
