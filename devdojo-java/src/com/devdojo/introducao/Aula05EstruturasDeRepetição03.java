package src.com.devdojo.introducao;

import java.util.Scanner;

public class Aula05EstruturasDeRepetição03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o seu salário anual?");
        double salario = sc.nextDouble();
        double imposto;
        if (salario <= 34.713) {
            imposto = (9.70 * salario) / 100;
        }
        else if (salario > 34.713 && salario <= 68.508) {
            imposto = (37.35 * salario) / 100;
        }
        else{
            imposto = (49.50 * salario) / 100;
        }
        System.out.println(imposto);
    }
}
