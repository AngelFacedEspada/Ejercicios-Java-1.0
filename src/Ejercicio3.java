import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// ejercicio 3
		int num1, num2;
		Scanner leer = new Scanner(System.in);
		System.out.println("dime el valor del numero 1");
		num1 = leer.nextInt();
		System.out.println("dime el valor del numero 2");
		num2 = leer.nextInt();
		if (num1>=num2) {
			System.out.println("el numero " + num1 + " es mayor que " + num2);
		}else {
			System.out.println("el numero " + num2 + " es mayor que " + num1);
		}

	}
}