package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.
*/
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario fun = new Funcionario();
		
		System.out.print("Name: ");
		fun.Name = sc.nextLine();
		System.out.print("Gross salary: ");
		fun.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		fun.Tax = sc.nextDouble();
		System.out.println();
		System.out.println("Funcionario: " + fun);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		fun.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + fun);

		
		
		
		
		
		
		
		sc.close();
	}

}
