package aplicativo;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class programa {

	public static void main(String[] args) {
		/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.*/
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle widht :");
		rect.widht = sc.nextDouble();
		System.out.println("Eenter rectangle height :");
		rect.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", rect.area());
		System.out.printf("Perimeter = %.2f%n", rect.perimeter());
		System.out.printf("Diagonal = %.2f%n", rect.diagonal());
		
		
		
		sc.close();

	}

}
