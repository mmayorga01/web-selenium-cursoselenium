package com.javabasics;

public class Tickets {
//Objetos en base a la clase Tickets
	int precioAdulto, edad;
	double precioNino, precioEstudiante;//Se realiza descuentos precio
	boolean estudiante = false;
	String costo;
	//Constructor
	public Tickets(int precioNormal, int edadPersona, boolean credencialEstudiante) { //Instancias dentro del constructor, los datos que le coloque son los que va ha reaccionar el sistema como parámetros
		precioAdulto = precioNormal;
		precioNino = precioNormal*(.85);
		precioEstudiante = precioNormal *(.5);
		costo = "PrecioNormal";
		edad = edadPersona;
		estudiante = credencialEstudiante;
	}
	//Métodos
	
	public void costoDia() {
		System.out.println("El Costo Ticket:" +costo);
	}
	
	public void precioAdulto() {
		System.out.println("Ticket Adulto:" +precioAdulto);
	}
	
	public void precioNino() {
		System.out.println("Ticket Nino:" +precioNino);
	}
	
	public void precioEstudiante() {
		System.out.println("Ticket Estudiante:" +precioEstudiante);
	}
	
	public void verificarcostoTicket() {
		if(estudiante == true) {
			System.out.println("Eres un estudiante, el precio de tu ticket es:"+precioEstudiante);
	}else if(edad > 18) {
		System.out.println("Eres un Adulto el precio de tu ticket es"+precioAdulto);
	}	else {
		System.out.println("Eres un Niño el precio de tu tickets es" +precioNino);
	}
	}
	
	//Sobrecarga de metodos
	
	public double sumarTicket() {
		double suma = precioAdulto + precioNino;
		System.out.println(suma);
		return suma;
	}
	
	public double sumarTicket(int descuento) {
		double suma = (precioAdulto + precioNino)- descuento;
		System.out.println(suma);
		return suma;
	}
	
	public double sumarTicket(int descuento, int descuentoExtra) {
		double suma = (precioAdulto + precioNino)- descuento - descuentoExtra;
		System.out.println(suma);
		return suma;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tickets tickets = new Tickets(100, 19,true);// El primer Tickets es la clase, el segundo es una variable de tipo constructor por eso se le pone igual new y nombre del constructor
			tickets.costoDia();
			tickets.precioAdulto();
			tickets.precioNino();
			tickets.precioEstudiante();
			tickets.verificarcostoTicket();
			tickets.sumarTicket(20,20);
	}

}
