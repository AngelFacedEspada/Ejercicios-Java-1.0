import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Ejercicio 2
		float num1,num2,div;
		Scanner leer = new Scanner(System.in);
		System.out.println("dime el valor del numero 1");
		num1 = leer.nextInt();
		System.out.println("dime el valor del numero 2");
		num2 = leer.nextInt();
		div=num1/num2;
		System.out.println("calculos:");
		System.out.println("suma = " + (num1+num2));
		System.out.println("resta = " + (num1-num2));
		System.out.println("multiplicacion = " + (num1*num2));
		System.out.println("division = " + div);
	}

}
