package com.jacaranda.lemas;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Letra {
	
	private char letra;
	private List<Palabra> palabras;
	
	
	public Letra(char letra) throws LetraException {
		super();
		this.setLetra(letra);
		this.palabras = new LinkedList<>();
	}


	public char getLetra() {
		return letra;
	}

	
	private void setLetra(char letra) throws LetraException {
		if(!Character.isLetter(letra)) {
			throw new LetraException("Solo puede ser una letra");
		}
		this.letra = Character.toUpperCase(letra);
	}
	
	private Palabra existePalabra(String nombre) {
		boolean encontrada = false;
		Palabra p = null;
		Iterator<Palabra> iterador = palabras.iterator();
		while(iterador.hasNext() && !encontrada) {
			p = iterador.next();
			if(p.getNombre().equalsIgnoreCase(nombre)) {
				encontrada = true;
			}
		}
		if(!encontrada) {
			p = null;
		}
		return p;
	}
	
	public void addPalabra(String nombre, String significado) throws LetraException {
		boolean encontrada = false;
		int indice = 0;
		try {
			Palabra p = existePalabra(nombre);
			if(p==null) {
				p = new Palabra(nombre);
				Iterator<Palabra> iterador = palabras.iterator();
				while(iterador.hasNext() && !encontrada) {
					Palabra palabra = iterador.next();
					if(palabra.compareTo(p)>0) {
						indice = palabras.indexOf(palabra);
						encontrada = true;
					}
				}
				palabras.add(indice, p);
				p.addSignificado(new Significado(significado));
			}
			else {
				p.addSignificado(new Significado(significado));
			}
		} catch (LemaException | DefinicionException e) {
			throw new LetraException(e.getMessage());
		}
	}
	
	
	public String buscarPalabra(String nombre) throws LetraException {
		String mensaje;
		Palabra p = existePalabra(nombre);
		if(p==null) {
			mensaje = "No existe la palabra";
		}else {
			mensaje = p.toString();
		}
		return mensaje;
	}
	
	public void borrarPalabra(String nombre) throws LetraException {
		Palabra p = existePalabra(nombre);
		if(p==null) {
			throw new LetraException("No existe la palabra.");
		}
		else {
			palabras.remove(p);
		}
	}
	
	
	public String listaPalabras(String cadena) throws LetraException {
		boolean salir = false;
		StringBuilder mensaje = new StringBuilder();
		if(cadena==null) {
			throw new LetraException("La cadena no puede ser nula.");
		}
		Iterator<Palabra> siguiente = palabras.iterator();
		Palabra p = null;
		while(siguiente.hasNext() && !salir) {
			p = siguiente.next();
			if(p.getNombre().startsWith(cadena.toUpperCase())) {
				mensaje.append(p + "\n");
			}else if(p.getNombre().startsWith(cadena)==false && mensaje.toString().isEmpty()==false) {
				salir = true;
			}
		}
		return mensaje.toString();
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(letra);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Letra other = (Letra) obj;
		return letra == other.letra;
	}


	@Override
	public String toString() {
		return letra + ", palabras=" + palabras.toString() + "]";
	}
	
	
}
