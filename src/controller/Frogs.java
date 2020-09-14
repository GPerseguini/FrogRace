package controller;
import java.util.Random;


public class Frogs extends Thread{
	int distancia, posicao, salto;
	static int pos;
	
	public Frogs(int distancia){
		this.distancia = distancia;
		posicao = 0;
	}
	
	public void run (){
		jump();
	}
	
	public void jump(){
		Random random = new Random();
		while (posicao < distancia){
			salto = random.nextInt(20);
			posicao = salto + posicao;
			System.out.println("O sapo " + getId()+ " saltou " + salto + " metros ");
			if (posicao > distancia) {
				System.out.println("O Sapo " + getId() + " chegou ao final do percurso em " + (pos+1) +" lugar.");
				pos++;
			}
		}
		
	}
}
