package PRIMEIRO_DESAFIO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        Integer size = sc.nextInt();

        for(int i= 0;i<size;i++){
            Integer num = sc.nextInt();

            if( (num % 2) == 0){
                pares.add(num);
            }else{
                impares.add(num);
            }
        }

        pares.stream().sorted().forEach(System.out::println);

        impares.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        sc.close();
    }
}
