/**
 * 
 */
package notas;

/**
 * @author Daniel Calatrava González
 *
 */
import java.util.Scanner;

public class Notas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int notas = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		notas = reader.nextInt();
		califica(notas);
		reader.close();
	}

	/**
	 * @param notas
	 * @deprecated Use {@link #califica(int)} instead
	 */
	public static void cali(int notas) {
		califica(notas);
	}

	/**
	 * @param num_nota
	 */
	public static void califica(int num_nota) {
		String calificacion;
		if (num_nota >= 0 && num_nota < 5)
			calificacion = "Suspenso";
		else if (num_nota >= 5 && num_nota < 7)
			calificacion = "Aprobado";
		else if (num_nota >= 7 && num_nota < 9)
			calificacion = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "La nota introducida no es correcta";
		System.out.println(calificacion);
	}

}
