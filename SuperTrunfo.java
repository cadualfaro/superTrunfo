/*
Implementar um jogo de super-trunfo entre 2 jogadores

Cada jogador tem 6 cartas diferentes

Uma rodada tem 6 jogadas ( [jogador1, carta1] vs [jogador2,carta1] , ..... )
A sequência de atributos segue a ordem do slide anterior

Jogada 1 -> atributo comparado: velocidade máxima
Jogada 2 -> atributo comparado: cilindradas
Ganha a jogada, o jogador que tiver a carta com o maior valor do atributo
Mostre, ao final das 6 jogadas, quantas vitórias teve cada jogador, e quantos empates houveram
 */
package supertrunfo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SuperTrunfo {

        static public int Placar(){
        System.out.println("Vitorias 1: "+Rodada.winp1);
        System.out.println("Vitorias 2: "+Rodada.winp2);
        System.out.println("Rodadas empatadas: "+Rodada.empate);
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Digite o nome do jogador 1: ");
            String nome1 = my_scan.next();
        System.out.println("Digite o nome do jogador 2: ");
            String nome2 = my_scan.next();
        System.out.println("");
        
        Jogador j1 = new Jogador(nome1);
        Jogador j2 = new Jogador(nome2);
        
        Card c1 = new Card("Fox Sportline", 186, 1599, 10.8, 101, 3804, 1040);
            Card c2 = new Card("Golf GTI", 227, 1781, 7.8, 180, 4147, 1251);
        Card c3 = new Card("Gol Power", 189, 1781, 10.1, 103, 3931, 988);
            Card c4 = new Card("GX3", 230, 1600, 5.7, 125, 3754, 570);
        Card c5 = new Card("1 Litre", 120, 300, 16.1, 9, 3.65, 290);
            Card c6 = new Card("CrossFox", 175, 1599, 11, 101, 4.08, 1129);
        Card c7 = new Card("Eco Racer", 230, 1484, 6.3, 136, 3.77, 850);
            Card c8 = new Card("EOS", 232, 1984, 7.8, 200, 4.407, 1536);
        Card c9 = new Card("Bora", 195, 1984, 11.0, 116, 4376, 1240);
            Card c10 = new Card("Concept R", 268, 3189, 5.3, 265, 4.12, 1300);
        Card c11 = new Card("Cocept T", 228, 3198, 6.9, 265, 4.12, 1300);
            Card c12 = new Card("Polo", 187, 1599, 11.4, 101, 3915, 1115);
        
        ArrayList<Card> Cards;
        Cards = new ArrayList<>();
        Cards.add(c1); Cards.add(c2); Cards.add(c3); 
        Cards.add(c4); Cards.add(c5); Cards.add(c6);
        Cards.add(c7); Cards.add(c8); Cards.add(c9);
        Cards.add(c10); Cards.add(c11); Cards.add(c12);
        
            for(int i = 0; i<6;i++){ //Rodadas
            new Rodada(j1.RandCard(Cards),j2.RandCard(Cards));
            }
        
        Placar();
        
    }
    
}
