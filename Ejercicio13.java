import java.util.*;
public class Ejercicio13{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int opcion=0;
		while(opcion!=3) {
			System.out.println("Opciones que se pueden realizar: ");
			System.out.println("1.Sumar, 2.Dividir, 3.Salir");
			System.out.print("Ingrese el numero de opcion que desea realizar: ");
			opcion=scanner.nextInt();
			if (opcion==1) {
				System.out.println("Ingrese el primer numero: ");
				int numero1=scanner.nextInt();
				System.out.println("Ingrese el primer numero: ");
				int numero2=scanner.nextInt();
				int suma=numero1+numero2;
				System.out.println("La suma es: "+suma); 
			} else if(opcion==2){
				System.out.println("Ingrese el dividendo: ");
				double dividendo=scanner.nextDouble();
				System.out.println("Ingrese el divisor: ");
				double divisor=scanner.nextDouble();
				if (divisor==0) {
					System.out.println("No es posible dividir entre 0, ingrese un divisor correcto");	
				} else {
				double division=dividendo/divisor;
				System.out.println("La division es: "+division);
				} 
			} else if(opcion==3) {
				System.out.println("--------Adios------");
			}
		}
	}
}