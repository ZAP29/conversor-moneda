import java.util.Scanner;

public class Conversor {
	
	private double[] valorCambios = {4788.63, 5100.13, 5763.11, 35.25, 3.70};
	private String[] nombreCambios = {"USD", "EUR", "GBP", "JPY", "KRW"};
	
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		while(true){
			
			int opcion = 0;
			System.out.println("******************** MENU ********************");
			System.out.println("1-> COP/USD ");
			System.out.println("2-> COP/EUR ");
			System.out.println("3-> COP/GBP ");
			System.out.println("4-> COP/JPY ");
			System.out.println("5-> COP/KRW ");
			System.out.println("6-> USD/COP ");
			System.out.println("7-> EUR/COP ");
			System.out.println("8-> GBP/COP ");
			System.out.println("9-> JPY/COP ");
			System.out.println("10-> KRW/COP ");
			System.out.println("11-> SALIR ");
			System.out.print("Ingrese una opcion: ");
			opcion = sc.nextInt();
			if (opcion == 11) {
				System.out.println("SALIENDO");
				break;
			}
			else if (opcion > 5){
				convertirCop(opcion);
			}
			else {
				convertir(opcion);
			}		
		}
	}
	
	public void convertirCop(int opcion) {
		
		try {
			
			System.out.println(nombreCambios[(opcion-5)-1]+"/COP");
			System.out.print("Ingrese el monto a cambiar: ");
			double monto = sc.nextDouble();
			double cambio = monto * valorCambios[(opcion-5)-1];
			System.out.println("El monto de COP en USD es: " + cambio);
			
		} catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un valor numérico válido.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Opción inválida.");
        }
	}
	
	public void convertir(int opcion) {
		
		try {
			
			System.out.println("COP/"+nombreCambios[opcion-1]);
			System.out.print("Ingrese el monto a cambiar: ");
			double monto = sc.nextDouble();
			double cambio = monto / valorCambios[opcion-1];
			System.out.println("El monto de COP en USD es: " + cambio);
			
		} catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un valor numérico válido.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Opción inválida.");
        }
	}
}
