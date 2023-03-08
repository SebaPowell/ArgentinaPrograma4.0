package Miprimerproyecto;

public class EjercicioClase01Ej02 {

	public static void main(String[] args) {
		
		float ingresoMensual = 100000; //totales del hogar equivalentes o superiores a $489.083
		int cantVehiculosAntMenor5anos = 1; //Tener 3 o más vehículos con una antigüedad menor a 5 años.
		int cantInmuebles = 2; //Tener 3 o más inmuebles.
		int cantVehiculosLujo = 0; //una embarcación, una aeronave de lujo o ser titular de activos
								   //societarios que demuestren capacidad económica plena
	
		if(ingresoMensual >= 489083 || cantVehiculosAntMenor5anos >= 3 || cantInmuebles >= 3 || cantVehiculosLujo > 0) {
			
			
			System.out.println("El hogar pertenece al segmento de ingresos altos");
			
		}else {
			System.out.println("El hogar NO pertenece al segmento de ingresos altos");
		}
	}
		
}

