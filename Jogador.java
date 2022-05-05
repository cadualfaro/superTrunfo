package supertrunfo;

import java.util.ArrayList;
import java.util.Random;

public class Jogador {
    static String nome1 = "", nome2;
    
    public Jogador(String name){
    if(nome1==""){
        nome1 = name;
    }
    
    else{
        nome2 = name;
    }
    }
    
    public Card RandCard(ArrayList <Card> Cards){
        Random rand = new Random();
        
        return Cards.get(rand.nextInt(Cards.size()));
    }

    

    

}
