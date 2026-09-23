package src.com.devdojo.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
    
    // + - / * %
        int n1 = 10;
        int n2 = 20;
        System.out.println(n1 + n2); 

    // < > <= >= == !=
        boolean maiorQue = 10 > 5;
        boolean menorQue = 10 < 20;
        boolean maiorIgual = 10 >= 9;
        boolean igualA1 = 10 == 10;
        boolean igualA2 = 10 == 10.0;
        boolean diferente = 10 != 20;

        System.out.println(maiorQue);
        System.out.println(menorQue);
        System.out.println(maiorIgual);
        System.out.println(igualA1);
        System.out.println(igualA2);
        System.out.println(diferente);
         
    // && (and)  || (or) !
        int idade = 24;
        float salario = 4000F;
        boolean dentroDaLei1 = idade >= 30 && salario >= 4612;
        boolean dentroDaLei2 = idade < 30 && salario >= 3381;
            if(dentroDaLei1 == true || dentroDaLei2 == true){
                System.out.println("Está dentro da lei!");
            }else{
                System.out.println("Está fora da lei!");
            }

    // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

    // ++ --
        int cont = 0;
        cont += 1; // cont = cont + 1;
        cont ++;
        cont --;
        ++cont;
        --cont;

        boolean c = false;
        if(c = true){ 
            System.out.println(c);
        }
    }
}
