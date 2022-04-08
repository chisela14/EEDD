package registro;

import java.util.Objects;

public class Registro {
	private int numEmpleado;
	private String nombreEmpleado;
	private int mesesTrab;
	private char directivo;
	
	public Registro(int numEmpleado, String nombreEmpleado, int mesesTrab, char directivo) {
		super();
		this.numEmpleado = asignarNumEmpleado(numEmpleado);
		this.nombreEmpleado = asignarNombreEmpleado();
		this.mesesTrab = asignarMeses();
		this.directivo = asignarDirectivo();
	}
	private int asignarNumEmpleado(int numEmpleado) {
		
	}
	private String asignarNombreEmpleado(String nombreEmpleado) {
			
		}
	private int asignarMeses(int mesesTrab) {
		
	}
	private char asignarDirectivo(char directivo) {
		
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public int getMesesTrab() {
		return mesesTrab;
	}

	public void setMesesTrab(int mesesTrab) {
		this.mesesTrab = mesesTrab;
	}

	public char getDirectivo() {
		return directivo;
	}

	public void setDirectivo(char directivo) {
		this.directivo = directivo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(directivo, mesesTrab, nombreEmpleado, numEmpleado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registro other = (Registro) obj;
		return directivo == other.directivo && mesesTrab == other.mesesTrab
				&& Objects.equals(nombreEmpleado, other.nombreEmpleado) && numEmpleado == other.numEmpleado;
	}

	@Override
	public String toString() {
		return "Registro [numEmpleado=" + numEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", mesesTrab="
				+ mesesTrab + ", directivo=" + directivo + "]";
	}
	

}
