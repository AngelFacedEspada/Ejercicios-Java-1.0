
public class sumaparimpar {
	
	public static void sumaParImpar(int a, int b) {
		int sumaPar=0, sumaImpar=0;
	
		for (int i = a; i<=b; i++) {
			if (i%2==0) {
				sumaPar=sumaPar+1;
			}	else {
				sumaImpar=sumaImpar+1;
			}

	
		}
}
	public static void main(String[] args) {
		sumaParImpar(5, 100);
		System.out.println("Pares: " + sumaPar);
		System.out.println("Pares: " + sumaImpar);
}
}