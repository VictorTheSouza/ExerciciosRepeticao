package br.co.victor.ExRepeticao;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		int soma = 0;
		
		do {
			System.out.println("Digite um número do teclado: ");
			num = leia.nextInt();
			
			soma = soma + num;
			
		}while(num!=0);
		
		System.out.println("Essa é a soma dos números digitados " + soma);

	}

}
