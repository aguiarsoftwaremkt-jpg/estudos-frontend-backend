package src.com.devdojo.introducao;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um número de 1 a 7:");
        int dia = sc.nextInt();
        
        switch (dia){

            case 1:
                System.out.println("Domingo");
                break;
            
            case 2:
                System.out.println("Segunda");
                break;
            
            case 3:
                System.out.println("Terça");
                break;
            
            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;
            
            case 6:
                System.out.println("Sexta");
                break;
            
            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Opção invalida");
                break;
        }

        System.out.println("M = Masculino // F = Feminino");
        String sexo = sc.nextLine();

        switch (sexo){ 

            case "M":
                System.out.println("Sexo masculino");
                break;

            case "F":
                System.out.println("Sexo Feminino");
                break;
            
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
    
}
