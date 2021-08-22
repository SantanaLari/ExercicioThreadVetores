package view;

import java.util.Random;
import controller.ThreadVetor;

public class Main {
	
	public static void main(String[] args) {
		
		Random numAleatorio = new Random();
		
		int num;
		int vet [] = new int[1000];
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = numAleatorio.nextInt(101);
		}
		
		for(int i = 1; i < 3; i++) {
			num = i;
			Thread vetor = new ThreadVetor(num, vet);
			vetor.start();
		}
			
	}

}
