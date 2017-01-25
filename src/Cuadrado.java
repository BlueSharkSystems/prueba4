import java.util.Scanner;

public class Cuadrado {
	int perimetro, lado;
	Scanner  entrada = new Scanner(System.in);
	
	public void CrearPerimetro(){
		System.out.println("Introdusca el lado del cuadrado:");
		lado = entrada.nextInt();
		perimetro = lado * 4;
		System.out.println("El perimetro del cuadrado es:");
		System.out.println(perimetro);
	}
	
	public Cuadrado(){
		CrearPerimetro();
	}

}
