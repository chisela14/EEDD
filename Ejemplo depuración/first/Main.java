package de.vogella.combug.first;

public class Main {
	/**
	   * @param args (para indicar parámetros de entrada)
	   */
	  public static void main(String[] args) {
	    Counter counter = new Counter();
	    counter.count();
	    System.out.println("We have counted " + counter.getResult());
	  }
}
