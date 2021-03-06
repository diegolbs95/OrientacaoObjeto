package aplicacao;


import java.util.Locale;
import java.util.Scanner;


import entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		
		 //CHAMAMOS TRIANGULO DA CLASSE E IMPORTAMOS
		Triangulo X , Y ;
		
		//SEMPRE QUE CHAMAR UM VARIAVEL TEMOS QUE COLOCAR O NEW ...
		X = new Triangulo();
		Y = new Triangulo();
		
	System.out.println("Digite os tres lados do triagulo X");
	//COLOCAMOS A VARIAVEL PONTO E O ATRIBUTO QUE QUEREMOS ACESSAR
		X.a=sc.nextDouble();
		X.b=sc.nextDouble();
		X.c=sc.nextDouble();
		X.Area();
		
	System.out.println("Digite os tres lados do triagulo X");
		Y.a=sc.nextDouble();
		Y.b=sc.nextDouble();
		Y.c=sc.nextDouble();
		Y.Area();
		
	
		System.out.printf("Area do triando X = %.4f%n", X.Area() );
		System.out.printf("Area do triando Y = %.4f%n", Y.Area() );
		
		if(X.Area() > Y.Area()) {
			System.out.print("Area maior: X");
			
		}else {
			System.out.print("Area maior: Y");
		}
		

	sc.close();	
	}

}
