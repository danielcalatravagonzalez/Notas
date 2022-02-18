package notas;

/**
 * @author Daniel Calatrava González
 * @version 18/02/2022 1.0
 */
import java.util.Scanner;

public class Notas {

	/**
	 * @param args Método main el cual pregunta una nota para calificar
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int notas = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		notas = reader.nextInt();
		Califica.califica(notas);// Llamada al método califica de la clase Califica
		reader.close();
	}

	/**
	 * @param notas Método en desuso, utiliza el de la clase Califica
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	public static void cali(int notas) {
		Califica.califica(notas);
	}

	/**
	 * @param num_nota Método en desuso, usa el de la clase Califica
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	public static void califica(int num_nota) {
		Califica.califica(num_nota);
	}

}
