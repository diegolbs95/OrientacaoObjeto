package entidades;

public class Triangulo {

		public double a;
		public double b;
		public double c;
		
		public double Area() {
			//FORMULA DE CALCULA A AREA DE UM TRIANGULO
			//Math.sqrt E PARA SABER A RAIZ QUADRADA
			double p = (a + b + c)/ 2.0;
			return Math.sqrt(p * (p - a) * (p - b) * (p - c));
			
			
			
			
		}
		
	
}
		