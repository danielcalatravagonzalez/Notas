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
		Califica.califica(notas);
		reader.close();
	}

	/**
	 * @param notas
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	public static void cali(int notas) {
		Califica.califica(notas);
	}

	/**
	 * @param num_nota
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	public static void califica(int num_nota) {
		Califica.califica(num_nota);
	}

}
