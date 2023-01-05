package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {
	
	public static void main(String[] args) {
		/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante student = new Estudante();
		
		
		System.out.println("Name:");
		student.Name = sc.nextLine();
		System.out.println("Trimestre 01 :");
		student.T1 = sc.nextDouble();
		System.out.println("Trimestre 02 :");
		student.T2 = sc.nextDouble();
		System.out.println("Trimestre 03 :");
		student.T3 = sc.nextDouble();
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		else {
		System.out.println("PASS");
		}
		sc.close();
		
	}

}
