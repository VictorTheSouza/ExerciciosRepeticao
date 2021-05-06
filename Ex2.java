package br.co.victor.ExRepeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		int digitado;
		int par = 0;
		int impar = 0;
		
		for(num = 1; num<=10; num++) {
		
		System.out.println("Digite 10 Números: ");
		digitado = leia.nextInt();
		
		if(digitado%2==0){
			par++;
		}else {impar++;}
		}
		System.out.println("Essa é a quantidade de números pares: " + par +"\n E Essa é a quantidade de impares" + impar);
		
		
		
		
}
	}

