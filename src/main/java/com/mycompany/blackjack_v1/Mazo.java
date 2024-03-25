package com.mycompany.blackjack_v1;
import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> jugador;
    private ArrayList<Carta> crupier;

    public Mazo() {
        mazo = new ArrayList<>();
        jugador = new ArrayList<>();
        crupier = new ArrayList<>();
        
        llenarMazo();
        mezclarMazo();
    }
    
    public void llenarMazo(){
        String palo = "Corazones";
        
        for(int i = 0; i < 4; i++){
            //cambio el palo cada vuelta que da el primer bucle
            if(i == 1){
                palo = "Diamantes";
            }else{
                if(i == 2){
                    palo = "Treboles";
                }else{
                    if(i == 3){
                        palo = "Picas";
                    }
                }
            }
            
            for(int j = 2; j < 11; j++){                                
                mazo.add(new Carta(j,palo));
            }            
        }
        
        //hago lo mismo con las AQKJ
        palo = "Corazones";
        for(int i = 0; i < 4; i++){
            //cambio el palo cada vuelta que da el primer bucle
            if(i == 1){
                palo = "Diamantes";
            }else{
                if(i == 2){
                    palo = "Treboles";
                }else{
                    if(i == 3){
                        palo = "Picas";
                    }
                }
            }
            
            mazo.add(new Carta("A", palo,11));
            mazo.add(new Carta("Q", palo,10));
            mazo.add(new Carta("K", palo,10));   
            mazo.add(new Carta("J", palo,10));
        }
        
    }
        
    public void mezclarMazo(){
        // Mezclar el mazo
        Collections.shuffle(mazo);
    }
    
    public Carta repartir(){
    Carta carta = null;
    
    // Verifica si el mazo no está vacío antes de repartir una carta
    if (!mazo.isEmpty()) {
        carta = mazo.get(0);
        mazo.remove(0);
    } else {
        System.out.println("¡El mazo está vacío!");
    }
    
    return carta;
}
    
    //metodo para mostrar las cartas y las puntuaciones
    public void cartasPuntuacion(){
        //muestra la carta del crupier y su puntuacion
        System.out.println("Carta del crupier: " + crupier.get(0).getPalo() + " " + 
                  crupier.get(0).getValorLetra() + " " + crupier.get(0).getValorNumerico());
        
        System.out.println("Puntuacion del crupier: " + crupier.get(0).getValorNumerico());
        
        //muestra las cartas del jugador y su puntuacion
        System.out.println("Tus cartas: ");
        System.out.println(jugador.get(0).getPalo() + " " + 
                  jugador.get(0).getValorLetra() + " " + jugador.get(0).getValorNumerico());
        
        System.out.println(jugador.get(1).getPalo() + " " + 
                  jugador.get(1).getValorLetra() + " " + jugador.get(1).getValorNumerico());
        
        System.out.println("Tu puntuacion: " + (jugador.get(1).getValorNumerico() + jugador.get(0).getValorNumerico()));
    }
    
    
    public void inicioJuego(){
        //reparte las cartas al jugador y al crupier
        for(int i = 0; i < 2; i++){
            jugador.add(repartir());
            crupier.add(repartir());
        }
        
        cartasPuntuacion();
        
        
    }
    
}

