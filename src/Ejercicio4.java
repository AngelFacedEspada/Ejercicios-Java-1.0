import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// ejercicio 4
		int num1, num2, num3;
		Scanner leer = new Scanner(System.in);
		System.out.println("dime el valor del numero 1");
		num1 = leer.nextInt();
		System.out.println("dime el valor del numero 2");
		num2 = leer.nextInt();
		System.out.println("dime el valor del numero 3");
		num3 = leer.nextInt();
		if (num1>num2 & num1>num3) {
			System.out.println("el numero " + num1 + " es mayor que " + num2 + " y  mayor que " + num3);
		}else {
		if (num2>num1 & num2>num3) {
				System.out.println("el numero " + num2 + " es mayor que " + num1 + " y  mayor que " + num3);
		}else {
				System.out.println("el numero " + num3 + " es mayor que " + num1 + " y  mayor que " + num2);
		}
	}

}


}


