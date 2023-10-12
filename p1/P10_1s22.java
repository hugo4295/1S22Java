import java.util.Scanner;

public class P11_1s22{
  public static void main(String[] args){
  Scanner teclado = new Scanner(System.in);
  int edad;
  
  System.out.println("Ingresa tu edad");
  edad = teclado.nextInt();
  
  if (edad >= 18){
  System.out.println("Eres mayor de edad");
  }else{
  System.out.println("No eres mayor de edad");
  }
  // + - * / 
  // raiz cuadrada, potencia, residuo de division
  
  System.out.println("Raiz cuadrada de 10" + Math.sqrt(10));
  }
}

