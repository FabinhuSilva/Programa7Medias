
package programa7medias;

import java.util.Scanner;

/**
 *
 * @author Fabiano F Silva
 */
public class Programa7medias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner escolhaMenu = new Scanner(System.in);
        int opcao, notaMedia1=0,notaMedia2=0;
        double mediaNotas=0;
        
        double notaVezesPeso=0,somapeso=0, mediaPonderada = 0;
        int nota=0,peso=0;
        
        System.out.println(" --> Calculo de Medias <--");
            do{
        System.out.println("\n Digite:\n"
                + "1 - Media Aritimética\n"
                + "2 - Media Ponderada\n"
                + "3 - Sair");
        opcao = escolhaMenu.nextInt();
        switch(opcao){
            case 1:
                 System.out.println("Digite a Nota numero 01: ");
                 notaMedia1 = escolhaMenu.nextInt();
                 
                 System.out.println("Digite a Nota numero 02: ");
                 notaMedia2 = escolhaMenu.nextInt();
                 
                 mediaNotas = (notaMedia1 + notaMedia2) / 2;
                 
                 System.out.println("A Media das Notas Digitas é: "+mediaNotas);
                break;
            case 2:
               for(int contador = 0; contador < 3;contador++){ 
                 System.out.println("Digite o numero um numero : ");
                 nota = escolhaMenu.nextInt();
                 
                 System.out.printf("Digite o peso do numero acima : ");
                 peso = escolhaMenu.nextInt();
              
                 notaVezesPeso =notaVezesPeso+(nota * peso);
                 somapeso = somapeso+peso;
               }
                mediaPonderada = notaVezesPeso / somapeso;
                System.out.println("A média  Ponderada sera: "+mediaPonderada);
                break;
            default:
                   break;
    }
            }while(opcao !=3);
            
            
        }
    
    }
    
    
}
