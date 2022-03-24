package SEGUNDO_DESAFIO;

import java.util.Locale;

public class Divisao {

    private Double valorTotal;
    private Double divisor;
    private Integer divisao;
    private String tipo;
    private Double resto;

    public Divisao(Double valorTotal,Double divisor,String tipo){
        this.valorTotal=valorTotal;
        this.divisor = divisor;
        this.tipo = tipo;

        divisao = (int) (valorTotal / divisor);
        resto = valorTotal % divisor;
    }

    public Double getResto(){
        return resto;
    }

    @Override
    public String toString() {
        return String.format(Locale.US,"%d  %s(s) de R$ %1.2f",divisao,tipo,divisor);
    }
}
