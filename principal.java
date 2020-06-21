import java.util.Scanner;
import java.io.*;

public class principal{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		System.out.print('\n'+"Introduzca el conjunto de caracteres con los que quiere trabajar"+'\n');

		String cadena = entrada.nextLine();

		System.out.print('\n'+"Introduzca el maximo de carcateres deseado"+'\n');

		int maximo= entrada.nextInt();

		int largoCadena= cadena.length();

		System.out.print('\n'+"largo de la cadena :"+largoCadena+'\n');
		System.out.print('\n'+"Cadena :"+cadena+'\n');
		System.out.print('\n'+"Este programa aplica un procedimiento de calulo por cada posicion del string especificado anteriormente"+'\n');
		System.out.print('\n'+"Debe indicar con cuentas posiciones quiere trabajar,"+'\n');
		System.out.print('\n'+"Inserte el indice de inicio, tomamdo a 1 como primera posicion"+'\n');
		int inicio = entrada.nextInt()-1;
		System.out.print('\n'+"Inserte el indice final, que no debe ser mayor a "+largoCadena+'\n');
		int fin = entrada.nextInt();

		
		File borrar = new File("diccionario.txt");

		if(borrar.exists()){
			borrar.delete();

		}

		for(int i=inicio;i<fin;i++){
			Nodo superNodo= new Nodo(cadena.charAt(i),maximo,cadena);
			superNodo= null;

		}


		
	}


}
