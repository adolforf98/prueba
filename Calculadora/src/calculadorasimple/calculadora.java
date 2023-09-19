package calculadorasimple;

public class calculadora {
	static double resultadosuma;
	static double resultadoresta;
	static double resultadodivision;
	static double resultadomultiplicacion;

	
	protected static double Sumar(double numero1 , double numero2) {
		
		resultadosuma = numero1 + numero2;
		System.out.println(resultadosuma);
		return resultadosuma;
	}
	
	protected static double Restar(double numero1 , double numero2) {
		
		resultadoresta = numero1 - numero2;
		System.out.println(resultadoresta);
		return resultadoresta;
	}

	protected static double Multiplicar(double numero1 , double numero2) {
		
		resultadomultiplicacion = numero1 * numero2;
		System.out.println(resultadomultiplicacion);
		return resultadomultiplicacion;
	}
	
	protected static double Dividir(double numero1 , double numero2) {
		
		resultadodivision = numero1 / numero2;
		System.out.println(resultadodivision);
		return resultadodivision;
		
	}

}
