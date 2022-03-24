package QUARTO_DESAFIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer lines = sc.nextInt();
        String array[] = new String[lines];

        for(int i = 0;i < lines;i++){
            String line = "";
            try{
                line = br.readLine();
            }catch (Exception ioe) {
                System.exit(1);
            }

            String left = line.substring(0,line.length()/2);
            String right = line.substring(line.length()/2);

            array[i]="";
            for(int in = left.length()-1;in >= 0;in--){
                array[i] += ""+left.charAt(in);
            }
            for(int in = right.length()-1;in >= 0;in--){
                array[i] += ""+right.charAt(in);
            }
        }

        Arrays.stream(array).forEach(System.out::println);

        sc.close();

    }
}
