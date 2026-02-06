package ProgettoTelevisore;

import java.util.Scanner;

public class Televisore {
    
    private boolean isSpento = true;
    private int volume = 0;
    private int luminosita = 0;
    private int canale = 1;

    public Televisore(){}

    // SETTERS

    public void setSpento(boolean isSpento){
        if(isSpento == true || isSpento == false){
            this.isSpento = isSpento;
        }else{
            System.out.println("Input mancante o errato!");
        }
    }
    // TELEVISION OPENER FUNCTION
    public void accendi(){
        setSpento(false);
    }

    // Volume Regolator

    public void regolaVolume(Scanner s){
        if(isSpento == false){
        System.out.println("Che volume vuoi mettere? Digita un numero intero da 0 a 10");
        int risposta = s.nextInt();
        this.volume = risposta;
        System.out.println("La televisione ora ha il volume: "+this.volume);
        }else{
            System.out.println("La televisione e' spenta non posso regolare il volume.");
        }
    }
        // Channel Regolator

    public void regolaCanale(Scanner s){
        if(isSpento == false){
        System.out.println("Che canale vuoi mettere? Digita un numero intero da 0 a 10");
        int risposta = s.nextInt();
        this.volume = risposta;
        System.out.println("La televisione ora ha il canale: "+this.canale);
        }else{
            System.out.println("La televisione e' spenta non posso regolare canale.");
        }
    }

    // POWER OFF Regolator

    public void spegniTv(){
        if(isSpento == false){
            isSpento = true;
            System.out.println("La TV e' stato spegnata.");
        }else{
            System.out.println("Non posso spegnare perche' e' gia stato spegnata.");
        }
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
    public void setLuminosita(int luminosita){
        this.luminosita = luminosita;
    }

    public void setCanale(int canale){
        this.canale = canale;
    }

    // GETTERS

    public boolean getSpento(){
        return this.isSpento;
    }

    public int getVolume(){
        return this.volume;
    }

    public int getLuminosita(){
        return this.luminosita;
    }

    public int getCanale(){
        return this.canale;
    }

}
