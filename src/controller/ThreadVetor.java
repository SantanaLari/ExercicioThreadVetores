package controller;

public class ThreadVetor extends Thread{
	
	private int num, vet[];
	
	
	public ThreadVetor(int num,  int vet[]) {
		this.num = num;
		this.vet = vet;
	}
	
	public void run() {
		percorrerVetor();
	}
	
	public void percorrerVetor() {
		switch(num) {
		case 1:
			numeroImpar();
			break;
		case 2:
			numeroPar();
			break;
		}
	}
	
	public void numeroPar() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		
		for(int i = 0; i < vet.length; i++) {
			buffer.append(vet[i]);
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal/Math.pow(10, 9);
		
		System.out.println("Numero Par levou: " + tempoTotal + "s.");
		
	}
	
	public void numeroImpar() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		
		for(int vetorImpar : vet) {
			buffer.append(vetorImpar);
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal/Math.pow(10, 9);
		
		System.out.println("Numero Impar levou: " + tempoTotal + "s.");
	}
	
	
}
