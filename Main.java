package ProgettoTelevisore;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Televisore televisore = new Televisore();
        boolean continua = true;

        //-->> TV OPENER WHILE <<-- //

        while(continua == true){
            System.out.println("vuoi accendere il televisore? (digita 1 = si, digita 2 = no");
            int risposta = scan.nextInt();

            switch (risposta) {
                case 1:
                    System.out.println("Televisore e' accesso.");
                    televisore.accendi();
                    continua = false;
                    break;

                case 2:
                    System.out.println("Televisore e' stato chiuso.");
                    televisore.setSpento(false);
                    continua = false;
                    break;
            
                default:
                    System.out.println("Digita un numero valida!");
                    break;
            }
        }

        //-->> VOLUME REGOLATOR WHILE <<-- //

        continua=true;
        while (continua) { // && !televisione.getSpento << E' possibile da fare anche in modo questo. 
                
                System.out.println("Vuoi regolare il volume del televisore? (1: Si, 2: No");
                int risposta = scan.nextInt();

                switch (risposta) {
                    case 1:
                        televisore.regolaVolume(scan);
                        System.out.println("Il volume e' stato regolato.");
                        continua = false;
                        break;
                    case 2:
                        televisore.setVolume(risposta);
                        System.out.println("Il volume e' stato regolato.");
                        continua = false;
                        break;
                
                    default:
                        System.out.println("Inserisci un numero valido!");
                        break;
                }
            }

        //-->> CHANNEL REGOLATOR WHILE <<-- //

        continua=true;
        while (continua) { // && !televisione.getSpento << E' possibile da fare anche in modo questo. 
                
            System.out.println("Vuoi cambiare la canale? (1: Si, 2: No");
            int risposta = scan.nextInt();

                switch (risposta) {
                    case 1:
                        televisore.regolaCanale(scan);
                        System.out.println("Il canale e' stato regolato.");
                        continua = false;
                        break;
                    case 2:
                        televisore.setVolume(risposta);
                        System.out.println("Il canale non e' stato regolato.");
                        continua = false;
                        break;
                
                    default:
                        System.out.println("Inserisci un numero valido!");
                        break;
                }
            }

            //-->> TURN-OFF THE TV <<--//

        continua=true;
        while (continua) { // && !televisione.getSpento << E' possibile da fare anche in modo questo. 
                
            System.out.println("Vuoi spegnere la TV? (1: Si, 2: No");
            int risposta = scan.nextInt();

                switch (risposta) {
                    case 1:
                        televisore.spegniTv();
                        continua = false;
                        break;
                    case 2:
                        televisore.setVolume(risposta);
                        System.out.println("La TV non sara' chihuso.");
                        continua = false;
                        break;
                
                    default:
                        System.out.println("Inserisci un numero valido!");
                        break;
                }
            }

    }
}
