/*Vista
 * version 1
 * 
 * 2020/02/09
 * 
 * copyRight
 */

package senoPaquete;

import java.util.Scanner;

public class Vista {
	public void impresion() {
		Controlador ctrl = new Controlador();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el numero de repeticiones");
		int n= teclado.nextInt();
		System.out.println("ingrese los  grados");
		double grados=teclado.nextDouble();
		/* SE CREAN LAS VARIABLES NECESARIAS DE INGRESO PRO TECLADO */
		ctrl.operar(grados, n);
		
		}
}
