package pkInventario.pkReinoViviente.pkVegetal.PlantaConFlor;

public class Naranja extends PlantaConFruto{
    public Naranja(){
        super(true,true);
        setNombreCientifico("Naranaja (Citrus sinensis)");
    }

    public void injertarConDurazno(Durazno duraznito){
        System.out.println("Estoy injertandome con " + duraznito.getNombreCientifico());
    }

}
