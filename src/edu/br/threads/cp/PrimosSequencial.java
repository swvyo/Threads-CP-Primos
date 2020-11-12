package edu.br.threads.cp;

public class PrimosSequencial {
  public static void main(String []args){
    long  t = System.currentTimeMillis();
    boolean flag;
    System.out.println("Números Primos");
    System.out.print("2");
    for(int i = 3; i < 1000000; i++){
      flag = false;
      for (int j = 2; (j*j <= i); j++)
        if (i%j == 0){
          flag = true;
          break;
        }
        if(!flag)
          System.out.print(", " + i);
    }
    System.out.println("\n    Tempo " + (System.currentTimeMillis() - t) + " ms");
  }
}