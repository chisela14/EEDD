package com.jacaranda.lemas;

public class Pruebas {

	public static void main(String[] args) throws LetraException, DiccionarioException {
		// TODO Auto-generated method stub
		Diccionario d1 = new Diccionario();
		d1.addPalabra("hola", "hola");
		d1.listadoPalabrasQueEmpiezanPor("man");

	}

}
