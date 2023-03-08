package Miprimerproyecto;

public class EjerciciosClase01Ej01 {

	public static void main(String[] args) {
		
		System.out.println("Resolucion item A del punto 1");
		
		int numeroInicio = 5;
		int numeroFin = 14;
		//Se deberan mostrar los numeros:
		
		while(numeroInicio <= numeroFin){
			
			System.out.println (numeroInicio);
			
			numeroInicio++;
		}
		System.out.println("Resolucion item B del punto 1");
		
		numeroInicio = 0;
		numeroFin = 14;
		//Se deberan mostrar los numeros:
		
		while(numeroInicio <= numeroFin){
			if((numeroInicio%2)==0) {
			System.out.println (numeroInicio);
			}
			numeroInicio++;
		}
		System.out.println("Resolucion item C del punto 1");
		numeroInicio = 0;
		numeroFin = 14;
		//Se deberan mostrar los numeros:
		boolean esPar = false;//true = nro par y false = nro impar
		
		while(numeroInicio <= numeroFin){
			
			if(esPar) {
				if((numeroInicio%2)==0) {
					System.out.println (numeroInicio);
				}
			}	
			if(!esPar) {
				if((numeroInicio%2)!=0) {
					System.out.println (numeroInicio);
				}
			}
			numeroInicio++;
		}
		
		System.out.println("Alternativa resolucion item C del punto 1");
		
		numeroInicio = 0;
		numeroFin = 14;
		
		char imprimir = 'i'; // p = par, i = impar
		
		while(numeroInicio <= numeroFin){
		
			switch (imprimir) {
			case 'p':
				if((numeroInicio%2)==0) {
					System.out.println (numeroInicio);
				}
				break;
			case 'i':
				if((numeroInicio%2)!=0) {
					System.out.println (numeroInicio);
				}
				break;
			default:
				System.out.println("Opcion Incorrecta");
			}
			numeroInicio++;
		}
		

		System.out.println("Resolucion item D del punto 1");
		
		numeroFin = 0;
		
		for(numeroInicio=14;numeroInicio>=numeroFin;numeroInicio--) {
			if((numeroInicio%2)==0) {
				System.out.println (numeroInicio);
			}
		}
	}			
}

