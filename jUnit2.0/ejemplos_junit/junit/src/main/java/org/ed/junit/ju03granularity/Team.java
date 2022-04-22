package org.ed.junit.ju03granularity;

import java.util.ArrayList;

/**
* Represents a team with players. Players are represented by numbers
*/
public class Team {
	
	private ArrayList<Integer> numbers;
	private String name;


	public Team(String name) {
		numbers = new ArrayList<>();
		this.name = name;
	}
	

	public String getName () {
		return name;
	}
	

	public int totalNumbers () {
		return numbers.size();
	}
	

	public void addNumber (Integer number) {
		if (number >= 0 && number <= 99) {
			numbers.add(number);
		}	
	}
	

	public Integer numberAt (int position) {
		if (totalNumbers() > 0)
			return numbers.get(position);
		else
			return -1;
	}

	public boolean removeNumber (Integer number) {
			return numbers.remove(number);
	}


	public void removeNumberAt (int position) {
		numbers.remove(position);
	}
}