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
		if (notas >= 0 && notas < 5)
			calificacion = "Suspenso";
		else if (notas >= 5 && notas < 7)
			calificacion = "Aprobado";
		else if (notas >= 7 && notas < 9)
			calificacion = "Notable";
		else if (notas >= 9 && notas <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "La nota introducida no es correcta";
		System.out.println(calificacion);
		reader.close();
	}

}
