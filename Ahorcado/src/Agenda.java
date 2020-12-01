import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		
		int x, menu;
		String numbuscar;
		Scanner leernum = new Scanner(System.in);
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime cuantos empleados tienes");
		x = leernum.nextInt();
		System.out.println("para añadir todos los empleados pulse : 1");
		System.out.println("para buscar un empleado pulse : 2");
		System.out.println("para borrar empleados pulse : 3");
		System.out.println("para editar empleados pulse : 4");
		System.out.println("para mostrar todos sus empleados pulse : 5");
		System.out.println("para mostrar el menu pulse : 7");
		System.out.println("para salir pulse : 6");
		System.out.println("¿Que desea hacer ahora?");
		String mEmpleado[][] = new String[x][2];
		
			menu = leernum.nextInt();
			while (menu != 6) {
				switch (menu) {
				case 1: {
					for (int i = 0; i < x; i++) {
						System.out.println("dime el nombre del empleado " + (i+1));
						mEmpleado[i][0] = leer.next();
						System.out.println("dime el numero del empleado " + (i+1));
						mEmpleado[i][1] = leer.next();
					}
					break;
				}
				case 2: {
					System.out.println("dime el numero o el nombre del empleado");
					numbuscar = leer.next();
					for (int j = 0; j < x; j++) {
						if (numbuscar.equals(mEmpleado[j][1]) || numbuscar.equals(mEmpleado[j][0])) {
							System.out.println("el nombre del empleado = " + mEmpleado[j][0]);
							System.out.println("el numero del empleado = " + mEmpleado[j][1]);
						}
					}
					break;
				}
				case 3: {
					System.out.println("dime el numero o el nombre del empleado que deseas borrar");
					numbuscar = leer.next();
					for (int k = 0; k < x; k++) {
						if (numbuscar.equals(mEmpleado[k][1]) || numbuscar.equals(mEmpleado[k][0])) {
							mEmpleado[k][0] = "";
							mEmpleado[k][1] = "";
						}
					}
					System.out.println("el empleado ha sido borrado");
					break;
				}
				case 4: {
					System.out.println("dime el numero o nombre del empleado que deseas editar");
					numbuscar = leer.next();
					for (int p = 0; p < x; p++) {
						if (numbuscar.equals(mEmpleado[p][1]) || numbuscar.equals(mEmpleado[p][0])) {
							System.out.println("dime el nuevo nombre del empleado");
							mEmpleado[p][0] = leer.next();
							System.out.println("dime el nuevo numero del empleado");
							mEmpleado[p][1] = leer.next();
						}
					}
					System.out.println("el empleado ha sido editado correctamente");
					break;
				}
				case 5: {
					for (int l = 0; l < x; l++) {
						if (!mEmpleado[l][1].equals("")) {
							System.out.println("el nombre del empleado " + mEmpleado[l][0] + " y su numero " + mEmpleado[l][1]);
						}
					}
					break;
				}
				case 7: {
					System.out.println("para añadir un empleado extra pulse : 0");
					System.out.println("para añadir todos los empleados pulse : 1");
					System.out.println("para buscar un empleado pulse : 2");
					System.out.println("para borrar empleados pulse : 3");
					System.out.println("para editar empleados pulse : 4");
					System.out.println("para mostrar todos sus empleados pulse : 5");
					System.out.println("para mostrar el menu pulse : 7");
					System.out.println("para salir pulse : 6");
					break;
				}
				default:
					System.out.println("ERROR esa opcion no esta en el menu");
				}
				System.out.println("¿Que desea hacer ahora?");
				menu = leernum.nextInt();
			}
				
			
	}

}
