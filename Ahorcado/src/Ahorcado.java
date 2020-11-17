import java.util.Scanner;

public class Ahorcado {
	
	public static void main(String[] args) {
		
		int vidas = 6;
		int i = 0;
		
		String vLetra[] = new String[100];
		String palabra = "hola";
		String palabra2 = "";
		
		String vAciertos[] = new String[4];
		
		vAciertos[0] = " ";
		vAciertos[1] = " ";
		vAciertos[2] = " ";
		vAciertos[3] = " ";
		
		String subpalabra2[] = new String[4];
		
		subpalabra2[0] = "";
		subpalabra2[1] = "";
		subpalabra2[2] = "";
		subpalabra2[3] = "";
		
		String subpalabra[] = new String[4];
		
		subpalabra[0] = "h";
		subpalabra[1] = "o";
		subpalabra[2] = "l";
		subpalabra[3] = "a";
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("tienes 6 vidas para acertar la palabra");
		
			do {
				
				System.out.println("dime una letra");
				
				vLetra[i] = leer.next();
				
				if (vLetra[i].equals(subpalabra[0]) || vLetra[i].equals(subpalabra[1]) || vLetra[i].equals(subpalabra[2]) || vLetra[i].equals(subpalabra[3]) ) {
					
					System.out.println("la letra " + vLetra[i] + " esta en la palabra, tienes " + vidas + " vidas restantes");
					
					if (vLetra[i].equals(subpalabra[0])) {
						
						subpalabra2[0] = vLetra[i];
						vAciertos[0] = vLetra[i];
						
						System.out.println("       ");
						System.out.println(vAciertos[0] + vAciertos[1] + vAciertos[2] + vAciertos[3]);
						System.out.println("- - - -");
						System.out.println("       ");
						
						palabra2 = subpalabra2[0] + subpalabra2[1] + subpalabra2[2] + subpalabra2[3];
						
						i=i+1;
					
					} else {
						
						if (vLetra[i].equals(subpalabra[1])) {
							
							subpalabra2[1] = vLetra[i];
							vAciertos[1] = vLetra[i];
							
							System.out.println("       ");
							System.out.println(vAciertos[0] + " " + vAciertos[1] + " " + vAciertos[2] + " " + vAciertos[3]);
							System.out.println("- - - -");
							System.out.println("       ");
							
							palabra2 = subpalabra2[0] + subpalabra2[1] + subpalabra2[2] + subpalabra2[3];
							
							i=i+1;
					
						} else {
							
							if (vLetra[i].equals(subpalabra[2])) {
								
								subpalabra2[2] = vLetra[i];
								vAciertos[2] = vLetra[i];
								
								System.out.println("       ");
								System.out.println(vAciertos[0] + " " + vAciertos[1] + " " + vAciertos[2] + " " + vAciertos[3]);
								System.out.println("- - - -");
								System.out.println("       ");
								
								palabra2 = subpalabra2[0] + subpalabra2[1] + subpalabra2[2] + subpalabra2[3];
								
								i=i+1;
							
							} else {
								
								if (vLetra[i].equals(subpalabra[3])) {
									
									subpalabra2[3] = vLetra[i];
									vAciertos[3] = vLetra[i];
									
									System.out.println("       ");
									System.out.println(vAciertos[0] + " " + vAciertos[1] + " " + vAciertos[2] + " " + vAciertos[3]);
									System.out.println("- - - -");
									System.out.println("       ");
									
									palabra2 = subpalabra2[0] + subpalabra2[1] + subpalabra2[2] + subpalabra2[3];
									
									i=i+1;
								}
							}
							}
							}

					
				} else {
					
					vidas = vidas - 1;
					
					for (int j = 0; j < i; j++) {
						
						if (vLetra[j].equals(vLetra[i])) {
							
							System.out.println("Error la letra " + vLetra[i] + " esta repetida");
							
							break;
						}
					}
					
					System.out.println("la letra " + vLetra[i] + " no esta en la palabra,  tienes " + vidas + " vidas restantes\"");
					
					i = i+1;
				}	
				
				switch (vidas) {
				
				case 1:
					
					System.out.println("        -------");
					System.out.println("        |     |");
					System.out.println("        |     O ");
					System.out.println("        |      ");
					System.out.println("        |      ");
					System.out.println("------------------");
					
					break;
					
				case 2:
					
					System.out.println("        -------");
					System.out.println("        |     |");
					System.out.println("        |      ");
					System.out.println("        |      ");
					System.out.println("        |      ");
					System.out.println("------------------");
					
					break;
					
				case 3:
					
					System.out.println("        -------");
					System.out.println("        |      ");
					System.out.println("        |      ");
					System.out.println("        |      ");
					System.out.println("        |      ");
					System.out.println("------------------");
					
					break;
					
				case 4:
					
					System.out.println("        |      ");
					System.out.println("        |      ");
					System.out.println("        |      ");
					System.out.println("        |      ");
					System.out.println("------------------");
					
					break;
				
				case 5:
					
					System.out.println("------------------");
					
					break;
				}

			} while ( !palabra2.equals(palabra) && vidas != 0 );
			
		if (vidas == 0) {
			
			System.out.println("        -------");
			System.out.println("        |     |");
			System.out.println("        |     O ");
			System.out.println("        |    /|l ");
			System.out.println("        |    / 7");
			System.out.println("        |      ");
			System.out.println("------------------");
			System.out.println("GAME OVER");
			
		} else {
			
			System.out.println("Felicidades has acertado la palabra secreta (" + palabra + ")");
			
		}
		

	}

}
