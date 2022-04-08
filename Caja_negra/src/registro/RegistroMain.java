package registro;

public class RegistroMain {

	public static void main(String[] args) {
		// Casos a probar
		//Equivalencia
		Registro pr1 = new Registro(010, "ALBA_GOMEZ", 045, '+');
		Registro pr2 = new Registro(995, "MARTAGOMEZ", 012, '-');
		Registro pr3 = new Registro(587, "PEDRO_ALVA", 010, '+');
		Registro pr4 = new Registro(460, "JESUS_GARA", 008, '-');
		Registro pr5 = new Registro(01, "ALBA_GOMEZ20", 04, 'L');
		Registro pr6 = new Registro(9955, "MARTA_GO", 0152, '--');
		Registro pr7 = new Registro(000, "0123456789", -1, 'G');
		Registro pr8 = new Registro(-5, "JESUS_GARA", 008, '+');
		Registro pr9 = new Registro(010, "ALBA_GOMEZ", -8, '+');
		Registro pr10 = new Registro(995, "0123456789", 012, '-');
		Registro pr11 = new Registro(587, "PEDRO_ALVAREZ", 010, 'J');
		//Límite
		Registro pr12 = new Registro(999, "ALBAGOMEZ", 999, '+');
		Registro pr13 = new Registro(998, "MARTAGOMEZ", 998, '-');
		Registro pr14 = new Registro(001, "PEDRO_ALVA", 000, '+');
		Registro pr15 = new Registro(002, "JESUS_GARA", 001, '-');
		Registro pr16 = new Registro(000, "ALBAGOMEZz", -1, '++');
		Registro pr17 = new Registro(1000, "MARTAGOME", 1000, '+');
		Registro pr18 = new Registro(01, "PEDRO_ALVA", 01, '-');
		Registro pr19 = new Registro(0022, "JESUS_GARA", 0021, '+');
	}
	//hacer un método para asignar la prima

}
