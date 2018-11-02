package nas1;

public class Triangulo {

	public static final String equilatero = "equilatero";
	public static final String isosceles = "isosceles";
	public static final String escaleno = "escaleno";
	public static final String rectangulo = "rectangulo";
	
	private double lado,lado1,lado2;
	private String tipo;
	
	public Triangulo(double lado,double lado1,double lado2,String tipo) {
		this.lado = lado;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.tipo = tipo;
	}
	
	public double area(Triangulo t) {
		double area = 0.0;
		switch(this.tipo) {
			case equilatero:
				area = (Math.sqrt(3.0)/4.0)*(lado*lado1);
				break;
			
			case isosceles:
				area = (lado1*(Math.sqrt((Math.pow(lado, 2))-((Math.pow(lado1, 2))/4))))/(2.0); 
				break;
			
			case escaleno:
				double s = ((lado+lado1+lado2)/2.0);
				area = (Math.sqrt(s*(s-lado)*(s-lado1)*(s-lado2)));
				break;
			
			case rectangulo:
				area = ((lado*lado1)/2.0);
				break;
		}
		
		return area;
	}
	
}
