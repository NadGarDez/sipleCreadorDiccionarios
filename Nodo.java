import java.io.*;

public class Nodo{

	String combinacion="";

	int grado;


	public Nodo(String combinacion, int maximo,String cadena){

		this.combinacion= combinacion;
		this.grado=this.combinacion.length();

		this.analizar(maximo,cadena);

	}

	public Nodo(char combinacion, int maximo,String cadena){

		this.combinacion= String.valueOf(combinacion);
		this.grado=this.combinacion.length();

		this.analizar(maximo,cadena);

	}


	public void combinaciones(String cadena,int maximo){


			String resultante= "";

			for(int i=0;i<cadena.length();i++){

				resultante = this.combinacion+cadena.charAt(i);
				//System.out.print('\n'+resultante);

				Nodo nodo = new Nodo(resultante,maximo,cadena);

				nodo= null;


			}


	}


	public void analizar(int maximo,String cadena){// AQUI SE PUEDE ESPECIFICAR CUALQUIER CONDICION ANTES DE LLAMAR AL METODO GUARDAR COINCIDENCI

		/*


		if((this.combinacion.indexOf("guarico")>-1)||(this.combinacion.indexOf("hotel")>-1)){ //aqui las coincidencias


			this.guardarCoincidencias(this.combinacion);

		}



*/
		System.out.print("\n"+this.combinacion);
		this.guardarCoincidencias(this.combinacion);
		
		if(this.grado<maximo){

			this.combinaciones(cadena, maximo);


		}


	}

	public void guardarCoincidencias(String coincidencia){

		//if(coincidencia.length()>=8){


			try{

				PrintWriter archivo = new PrintWriter(new FileWriter("diccionario.txt",true));
				archivo.println(coincidencia);
				archivo.close();


			}

			catch(IOException e){

				System.out.println("IO: " + e.getMessage());

			}
		//}
		

	}

}
