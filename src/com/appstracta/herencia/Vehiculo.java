package com.appstracta.herencia;

public class Vehiculo {
	// Propiedades o atributos
	private String color;
	private int velocidad;
	private boolean motor;
	private int ruedas;

	// Métodos o acciones
	public boolean arrancar() {
		return true;
	}

	public boolean frenar() {
		return true;
	}

	public String doblar() {
		return "mueve volante";
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return this.velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isMotor() {
		return this.motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	public int getRuedas() {
		return this.ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	@Override
	public String toString() {
		return "{" + " color :: '" + getColor() + "'" + ", velocidad ::'" + getVelocidad() + "'" + ", motor :: '"
				+ isMotor() + "'" + ", ruedas :: '" + getRuedas() + "'" + "}";
	}

}