package com.jacaranda.lemas;

import java.util.Objects;

public class Significado {
	
	private String definicion;
	
	public Significado(String definicion) throws DefinicionException {
		super();
		this.setDefinicion(definicion);
	}

	public String getDefinicion() {
		return definicion;
	}
	
	private void setDefinicion(String definicion) throws DefinicionException {
		this.definicion = definicion.toUpperCase();
	}

	@Override
	public int hashCode() {
		return Objects.hash(definicion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Significado other = (Significado) obj;
		return Objects.equals(definicion, other.definicion);
	}

	@Override
	public String toString() {
		return "  - " + definicion + "\n";
	}
	
	
}
