package TERCEIRO_DESAFIO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer array[] = new Integer[sc.nextInt()];

        Integer K = sc.nextInt();

        Integer pares = 0;

        for(int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }

        for(int i=0;i<array.length;i++){
            Integer atual = array[i];
            for(int in=0;in<array.length;in++){
                if(atual==array[in]){
                    continue;
                }

                if( (atual-array[in]) == K){
                    pares++;
                }
            }
        }

        System.out.println(pares);

        sc.close();
    }
}
