package Parcial1;
import java.util.Scanner;


public class MainExamen {
	public static void main(String[] args) {
	   	 Scanner scan = new Scanner(System.in);
		 Examen miExamen = new Examen();
		 int bandera = 0;
		
		 do {
		 System.out.println("Este es el menú examen, elija un número del 1 al 6:");
		 System.out.println("");
		 System.out.println("1. Hacer capital la primera letra de una palabra/oración");
		 System.out.println("2. Invertir una palabra/oración");
		 System.out.println("3. Hacer mayúsculas las vocales de una palabra/oración");
		 System.out.println("4. Mostrar los números del 1 al 100 según FizzBuzz");
		 System.out.println("5. Revisar si una palabra es palíndromo");
		 System.out.println("6. Salir");
			
		 int opcion = Integer.parseInt(scan.nextLine());
		 
		 
		 
		
			 switch(opcion) {
				case 1:
					System.out.println("Introduzca la palabra u oración:");
					String texto = scan.nextLine();
					System.out.println(miExamen.primeraMayuscula(texto));
					System.out.println("");
					break;
				
				case 2:
					System.out.println("Introduzca la palabra u oración a invertir:");
					String texto2 = scan.nextLine();
					System.out.println(miExamen.invertirCadena(texto2));
					System.out.println("");
					break;
				
				case 3:
					System.out.println("Introduzca la palabra u oración a transformar:");
					String texto3 = scan.nextLine();
					System.out.println(miExamen.vocalesMayuscula(texto3));
					System.out.println("");
					break;
				
				case 4:
					System.out.println("");
					System.out.println(miExamen.fizzBuzz());
					System.out.println("");
					break;
				
				case 5:
					System.out.println("Introduzca la palabra u oración a revisar:");
					String texto4 = scan.nextLine();
					System.out.println(miExamen.palindromo(texto4));
					System.out.println("");
					break;
					
				case 6:
					bandera = 1;	
					System.out.println("Saliendo del menú...");
					System.out.println("");
					break;
					
				default:
					System.out.println("Esa no es una opción, inténtelo de nuevo.");
					System.out.println("");
					break;
			 }
			 
		 } while(bandera == 0);
		
	scan.close();
	}
		
}

		
