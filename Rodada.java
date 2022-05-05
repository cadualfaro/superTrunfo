package supertrunfo;

public class Rodada {
    static public int winp1 = 0, winp2 = 0, empate = 0;
    
    public Rodada(Card carta1, Card carta2){
        
        System.out.println("Jogador 1: "+Jogador.nome1+"\n");
        carta1.MostrarCard();
        System.out.println("Jogador 2: "+Jogador.nome2+"\n");
        carta2.MostrarCard();
        
        if(carta1.vel_max > carta2.vel_max){
            System.out.println(Jogador.nome1+" foi o vencedor da rodada\n");
            winp1++;
        }
        
        else if(carta1.vel_max<carta2.vel_max){
            System.out.println(Jogador.nome2+" foi o vencedor da rodada\n");
            winp2++;
        }
        
        else{
            if(carta1.cilindradas>carta2.cilindradas){
            System.out.println(Jogador.nome1+" foi o vencedor da rodada\n");
            winp1++;
            }
            
            else if(carta1.cilindradas<carta2.cilindradas){
            System.out.println(Jogador.nome2+" foi o vencedor da rodada\n");
            winp2++;
            }
            
            else{
        System.out.println("A rodada empatou");
        empate++;
            }
        }
    }
}
