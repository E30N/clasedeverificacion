/*seno
 * version 1
 * 
 * 2020/02/09
 * 
 * copyRight
 */
package senoPaquete;

import java.util.Scanner;

public class seno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resultado=0;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el numero de repeticiones");
		int n= teclado.nextInt();
		System.out.println("ingrese los  grados");
		double grados=teclado.nextDouble();
		// ARRIBA SE CREAN LAS VARIABLES NECESARIAS 
		double x=0;
		double elevado=0;
		double gradosRadians=Math.toRadians(grados);
		double menosUno=0;
		double deno=0;
		double factor=0;
		double resultadoFinal=0;//ESTA VARIABLE ALMACENA EL RESULTADO FINAL PARA ALMACENAR LA
								//SUMATORIA
		//ARRIBA SE CREAN TODAS LAS VARIABLES QUE SE USARAN PARA LA ECUACION
		for (int i = 0; i < n; i++) {//SE USA EL FOR PARA SIMULAR LA SUMATORIA
			menosUno=Math.pow(-1, i); //SE USA ESTA VARIABLE PARA EL NUMERADOR DE LA ECUACION
									//1 ELEVADO A LA I
			deno=2*i+1;//VARIABLE PARA EL DENOMINADOR 
			factor=factorial(deno);//SE USA LA VARIABLE FACTOR PARA  
			
			elevado=2*i+1;//VARIABLE USADA PARA ELEVAR AL CUADRADO LA VARIABLE DE X
			
			x = Math.pow(gradosRadians,elevado);//SE DEFINE LA X COMO EN LA ECUACION CON SU ELEVADO
			
			resultado=(menosUno/factor)*x;//SE ALMACENA RESULTADO FINAL
			
			resultadoFinal=resultadoFinal+resultado;//SE ALMACENA EL RESULTADO POR CADA REPETICION
													//Y SE SUMA PARA DAR EL RESULTADO DE LA 
													//SUMATORIA
			
			
			
		}
		
		
		System.out.println(resultadoFinal);//SE IMPRIME EL RESULTADO FINAL
	
		
		
		
	}
	public static double factorial(double x) {//SE CREA UNA CLASE PARA DEFINIR EL FACTORIAL SIN
												//TANTA REDUNDANCIA


        if (x==0) {//SIGUIENDO LAS REGLAS IF X O EL VALOR AL CUAL LE VAMOS A SACAR FACTORIAL
        			//ES IGUAL A 0 SU FACTORIAL ES 1
        	
            return 1;
        }else {//DE LO CONTRARIO SE HACE LA OPERACION DE LA MULTIPLICACION DEL VALOR POR
        		//SU VALOR ANTERIOR
            return x * factorial(x-1);
        }

    }

}
