package calculadorasimple;
import java.util.*;
public class Main {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=0;
		double numero1;
		double numero2;
		

		do {
			
		
			System.out.println("Bienvenido a tu calculadora de confianza");
			System.out.println("Ingresa una opcion");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("Pulse 9 para salir");
			
			try {
				opcion = input.nextInt();
			} catch (InputMismatchException ex) {
	            System.out.println("Debe ingresar obligatoriamente un número entero.");
	        break;
	        }
			
				switch(opcion) {
		  case 1:
		    System.out.println("Introduzca el primer numero");
		    numero1 = input.nextDouble();
		    
		    System.out.println("Introduzca el primer numero");
		    numero2 = input.nextDouble();
		    calculadora.Sumar(numero1, numero2);
		    
		    break;
		  case 2:
			    System.out.println("Introduzca el primer numero");
			    numero1 = input.nextDouble();
			    System.out.println("Introduzca el primer numero");
			    numero2 = input.nextDouble();
			    calculadora.Restar(numero1, numero2);
		    break;
		  case 3:
			    System.out.println("Introduzca el primer numero");
			    numero1 = input.nextDouble();
			    System.out.println("Introduzca el primer numero");
			    numero2 = input.nextDouble();
			    calculadora.Multiplicar(numero1, numero2);
		    break;
		  case 4:
			    System.out.println("Introduzca el primer numero");
			    numero1 = input.nextDouble();
			    System.out.println("Introduzca el primer numero");
			    numero2 = input.nextDouble();
			    calculadora.Dividir(numero1, numero2);
		    break;
		  case 9:
			  System.out.println("Hasta la próxima!");
			  break;
		  default:
		    System.out.println("Introduzca una opcion valida");
		}	
		} while (opcion!=9);


	}

}
