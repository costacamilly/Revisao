import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Altura:");
    double altura = sc.nextDouble();
    System.out.println("peso:");
    double peso = sc.nextDouble();
    double imc = peso / (altura * altura);
    System.out.printf("Seu IMC é: %.2f", imc);

    sc.close();

  }
}