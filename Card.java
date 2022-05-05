package supertrunfo;

public class Card {
        double vel_max, zeroacem, comprimento, peso;
    String modelo;
    int cilindradas, potencia;
            
    public Card(String model,double velmx, int cil, double zac, int pot, double comp, double peso){
    modelo = model;
    vel_max = velmx;
    cilindradas = cil;
    zeroacem = zac;
    potencia = pot;
    comprimento = comp;
    this.peso = peso;
    }
    
    public void MostrarCard(){
        System.out.println("Modelo: "+modelo+"\nVelocidade Máxima: "+vel_max+" Km/h\nCilindradas: "+cilindradas+
        " CC\nVai de 0 a 100 em: "+zeroacem+" segundos\nPotência: "+potencia+" cavalos\nComprimento: "
        +comprimento+" metros\nPeso: "+peso+" Kg\n");
    }
    
}
