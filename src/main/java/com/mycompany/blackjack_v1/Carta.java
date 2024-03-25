package com.mycompany.blackjack_v1;

public class Carta {
    private int valorNumerico;
    private String palo;
    private String valorLetra;

    public Carta(int valorNumerico, String palo) {
        this.valorNumerico = valorNumerico;
        this.palo = palo;
    }
    
    public Carta(String valorLetra, String palo, int valorNumerico){
        this.valorLetra = valorLetra;
        this.palo = palo;
        this.valorNumerico = valorNumerico;
    }

    public int getValorNumerico() {
        return valorNumerico;
    }

    public void setValorNumerico(int valorNumerico) {
        this.valorNumerico = valorNumerico;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getValorLetra() {
        return valorLetra;
    }

    public void setValorLetra(String valorLetra) {
        this.valorLetra = valorLetra;
    }
     
}
