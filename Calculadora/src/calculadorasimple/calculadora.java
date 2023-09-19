package calculadorasimple;

public class calculadora {
	static double resultado;

	
	protected static double Sumar(double numero1 , double numero2) {
		
		resultado = numero1 + numero2;
		System.out.println("El resultado es "+resultado);
		return resultado;
	}
	
	protected static double Restar(double numero1 , double numero2) {
		
		resultado = numero1 - numero2;
		System.out.println("El resultado es "+resultado);
		return resultado;
	}

	protected static double Multiplicar(double numero1 , double numero2) {
		
		resultado = numero1 * numero2;
		System.out.println("El resultado es "+resultado);
		return resultado;
	}
	
	protected static double Dividir(double numero1 , double numero2) {
		
		resultado = numero1 / numero2;
		System.out.println("El resultado es "+resultado);
		return resultado;
	}
	
	protected static double CalculoRaices (double numero1, double numero2) {
		resultado = Math.pow(numero1, 1/numero2);
		System.out.println("El resultado es "+resultado);
		return resultado;
	}
	
	protected static double CalculoPotencias (double numero1, double numero2) {
		resultado = Math.pow(numero1, numero2);
		System.out.println("El resultado es "+resultado);
		return resultado;
	}

}
