package SEGUNDO_DESAFIO;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Double valor = sc.nextDouble();
        Double divisores[] = {100.00D,50.00D,20.00D,10.00D,5.00D,2.00D,1.00D,0.5D,0.25D,0.1D,0.05D,0.01D};

        for(int i = 0;i<divisores.length;i++){
            String tipo = divisores[i]>1D ? "nota":"moeda";

            if(i==0 || i==6){
                System.out.println(tipo.toUpperCase()+"S:");
            }

            Divisao divisao = new Divisao(valor,divisores[i],tipo);

            valor = divisao.getResto();

            System.out.println(divisao);
        }
        sc.close();
    }
}
