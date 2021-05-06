package br.co.victor.ExRepeticao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		
		int idade = 0;
		int totalMenos21 = 0;
		int totalMais50 = 0;
		
		while(idade>-99) {
			System.out.println(" Insira sua idade: ");
			idade = leia.nextInt();
		
			if(idade<21){
				totalMenos21++;
			}else if(idade>50){
				totalMais50++;
			}
		}
		System.out.println("Esse é número de menores de 21: " + totalMenos21 + "\nE o número de maiores de 50: " + totalMais50);
			

	}

}
