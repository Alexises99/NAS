package nas1;

import java.util.Scanner;

public class nas_ejercicio1 {
	
static Scanner S = new Scanner(System.in);
	
public static final String equilatero = "equilatero";
public static final String isosceles = "isosceles";
public static final String escaleno = "escaleno";
public static final String rectangulo = "rectangulo";

	static public String menu(String tipoTriangulo) {
		String resul = "";
		switch(tipoTriangulo) {
			case equilatero :
				resul = "equilatero";
				break;
			case isosceles:
				resul = "isosceles";
				break;
			case escaleno:
				resul = "escaleno";
				break;
			case rectangulo:
				resul = "rectangulo";
				break;
		}
		return resul;
	}
	
	public static void main (String [] args) {
		System.out.println("Introduce el tipo de triangulo: ");
		String tipoTriangulo = S.nextLine().trim().toLowerCase();
		double lado,area;
		
		switch(menu(tipoTriangulo)) {
		case equilatero:
			System.out.println("Introduce el lado del triangulo equilatero: ");
		    lado = S.nextDouble();
			area = (Math.sqrt(3.0)/4.0)*(lado*lado);
			System.out.println("El area es: "+area);
			break;
		case isosceles:
			System.out.println("Introduce el lado a de el triangulo isosceles: ");
			lado = S.nextDouble();
			System.out.println("Introduce el lado b de el triangulo isosceles: ");
			double lado1 = S.nextDouble();
			area = (lado1*(Math.sqrt((Math.pow(lado, 2))-((Math.pow(lado1, 2))/4))))/(2.0); 
			System.out.println("El area es: "+area);
			break;
		case escaleno:
			System.out.println("Introduce el lado a del triangulo escaleno: ");
			lado = S.nextDouble();
			System.out.println("Introduce el lado b del triangulo escaleno: ");
			double lado2 = S.nextDouble();
			System.out.println("Introduce el lado c del triangulo escaleno: ");
			double lado3 = S.nextDouble();
			double s = ((lado+lado2+lado3)/2.0);
		    area = (Math.sqrt(s*(s-lado)*(s-lado2)*(s-lado3)));
			System.out.println("El area es: " +area);;
		case rectangulo:
			
			System.out.println("Introduce el lado a del triangulo rectangulo: ");
			lado = S.nextDouble();
			System.out.println("Introduce el lado b del triangulo rectangulo: ");
			double lado4 = S.nextDouble();
			area = ((lado4*lado)/2.0);
			System.out.println("El area es: "+area);
			break;
		}
		
		
		
	}
}
