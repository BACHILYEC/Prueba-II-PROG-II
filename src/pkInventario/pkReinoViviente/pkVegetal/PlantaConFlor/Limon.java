package pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor;

public class Limon extends PlantaConFruto{
    public Limon(){
        super(true,true);
    }

    public void injertarCon(Naranja naranjita){
        System.out.println("Estoy injertandome con " + naranjita.getNombreCientifico());
    }

}
