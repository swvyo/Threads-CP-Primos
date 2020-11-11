package edu.br.threads.cp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTeste {
	
	public static void main(String args[]){
		
		long  t = System.currentTimeMillis();
		
		Primos t1 = new Primos(2,100000);
		Primos t2 = new Primos(100001,200000);
		Primos t3 = new Primos(200001,300000);
		Primos t4 = new Primos(300001,400000);
		Primos t5 = new Primos(400001,500000);
		Primos t6 = new Primos(500001,600000);
		Primos t7 = new Primos(600001,700000);
		Primos t8 = new Primos(700001,800000);
		Primos t9 = new Primos(800001,900000);
		Primos t10 = new Primos(900001,1000000);

		System.out.println("Iniciando as Threads: ");
		ExecutorService threadExecutor = Executors.newFixedThreadPool(10);

		threadExecutor.execute(t1);
		threadExecutor.execute(t2);
		threadExecutor.execute(t3);
		threadExecutor.execute(t4);
		threadExecutor.execute(t5);
		threadExecutor.execute(t6);
		threadExecutor.execute(t7);
		threadExecutor.execute(t8);
		threadExecutor.execute(t9);
		threadExecutor.execute(t10);
		threadExecutor.shutdown();
 
	System.out.println("\n    Tempo gasto: " + (System.currentTimeMillis() - t) + " ms");

	System.out.println("\n Threads finalizadas!");

 }
	

}