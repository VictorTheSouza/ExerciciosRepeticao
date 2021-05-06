package br.co.victor.ExRepeticao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int pessoas=0;
		int idade;
		int sexo;
		int humor;
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos=0;
		int outrosCalmos = 0;
		int pessoasNervosasMais40=0;
		int pessoasCalmasMenos18=0;
		
		while(pessoas<=150) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite seu sexo de acordo com os números: ");
			sexo = leia.nextInt();
			
			System.out.println("Digite seu humor de acordo com os números:");
			humor = leia.nextInt();
			
			pessoas++;
			
			{if(humor == 1){
				pessoasCalmas++;
			}}
			
			{if(humor == 2 && idade>40){
				pessoasNervosasMais40++;
			}}
			
			{if(humor == 1 && idade<18){
				pessoasCalmasMenos18++;
			}}
			
			{if(sexo==1 && humor==2) {
				mulheresNervosas++;
			}else if(sexo == 2 && humor == 3){
				homensAgressivos++;
			}else if(sexo == 3 && humor == 1) {
				outrosCalmos++;		}
	}

}
		System.out.println("Número de pessoas calmas: " + pessoasCalmas);
		System.out.println("Número de pessoas Nervosas com mais de 40 anos: " + pessoasNervosasMais40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: " + pessoasCalmasMenos18);
		System.out.println("Número de mulheres nervosas: " + mulheresNervosas);
		System.out.println("Números de homens agressivos: "  + homensAgressivos);
		System.out.println("Número de outros calmos: " + outrosCalmos);
		
	}
	}
