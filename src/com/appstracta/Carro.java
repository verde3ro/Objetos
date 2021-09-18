package com.appstracta;

public class Carro {

	// Propiedades o atributos
	private String color;
	private int velocidad;
	private boolean motor;
	private int i;

	// constructor nos permite crea la instacia o objeto
	public Carro() {
		System.out.println("Crea una instancia un objeto");
	}

	public Carro(String color, int velocidad) {
		this.color = color;
		this.velocidad = velocidad;
		System.out.println("Segundo constructor");
	}

	// Sobre carga de construtores
	public Carro(String color, int velocidad, boolean motor) {
		this(color, velocidad);
		this.motor = motor;
		System.out.println("Tercer constructor");
	}

	// Métodos o acciones
	public boolean arrancar() {
		return true;
	}

	public boolean apagar() {
		return true;
	}

	public int incrementarVelocidad(int velocidad) {
		i = this.velocidad += velocidad;
		return i;
	}

	// Encapsulamiento getter / setter
	// Getter
	public String getColor() {
		return this.color;
	}

	// Setter
	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return this.velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	// get para booleano es is
	public boolean isMotor() {
		return this.motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

}