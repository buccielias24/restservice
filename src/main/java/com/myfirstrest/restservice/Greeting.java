package com.myfirstrest.restservice;

public class Greeting {

	private final long id;
	private final String content;
	private final String nombre;
	private final double precio;

	public Greeting(long id, String content,String nombre, double precio) {
		this.id = id;
		this.content = content;
		this.nombre=nombre;
		this.precio=precio;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
}