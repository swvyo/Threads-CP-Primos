package edu.br.threads.cp;

//implementação da interface runnable para utilizar o metodo run()

public class Primos implements Runnable{
	private int min;
	private int max;

	public Primos(int x, int y){
		min = x;
		max = y;
 }
	public boolean prim(int x){
		for(int i=2; i<x/2+1;i++){
			if(x%i==0){
				return false;
			}
		}
	return true;
 }

 public void run(){
	 for(int i=min; i<=max;i++){
		 if(prim(i)){
			 
			 //exibir os números
			 //System.out.println(i);
		 }
	 }
	 System.out.println("");

 	}
}