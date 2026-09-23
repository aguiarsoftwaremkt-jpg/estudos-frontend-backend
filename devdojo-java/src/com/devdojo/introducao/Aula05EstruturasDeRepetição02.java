package src.com.devdojo.introducao;

import java.util.Scanner;

public class Aula05EstruturasDeRepetição02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a sua idade?");
        int idade = sc.nextInt();
        String categoria;

            if (idade < 15) {
                categoria = ("Categoria infantil");
            }else if (idade >= 15 && idade < 18) {
                categoria = ("Categoria Juvenil");
            }else {
                categoria = ("Categoria profissional");
            }
            System.out.println(categoria);
        
    }
}
