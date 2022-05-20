package com.jacaranda.lemas;

import java.util.HashSet;
import java.util.Objects;

public class Palabra implements Comparable<Palabra>{
	
	private String nombre;
	private HashSet<Significado> significados;
	
	
	public Palabra(String nombre) throws LemaException {
		super();
		this.setNombre(nombre);
		this.significados = new HashSet<>();		
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) throws LemaException {
		this.nombre = nombre.toUpperCase();
	}
	
	public void addSignificado(Significado significado) throws LemaException {
		if(!significados.add(significado)) {
			throw new LemaException("Significado ya existente.");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palabra other = (Palabra) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		StringBuilder mensaje = new StringBuilder(nombre + "\n");
		for(Significado s : significados) {
			mensaje.append(s);
		}
		return mensaje.toString();
	}

	@Override
	public int compareTo(Palabra o) {
		return nombre.compareToIgnoreCase(o.nombre);
	}
	
	
	
}
