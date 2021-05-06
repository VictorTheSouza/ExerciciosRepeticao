package br.co.victor.ExRepeticao;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		double media = 0;
		int numerodenum = 0;
		
		do {
			System.out.println("Digite um número do teclado: ");
			num = leia.nextInt();
			if(num%3==0 && num!=0) {
				media = media + num;
				numerodenum++;
			}
			
		}while(num!=0);
		media = media/numerodenum;
 		
			System.out.println("Esse é a média dos múltiplos de 3 :" + media);
			
	}

}
