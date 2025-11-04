package pkInventario.pkReinoViviente.pkVegetal.PlantasSinFlor;

import pkInventario.pkReinoViviente.ReinoVegetal;

public abstract class SinVasos extends ReinoVegetal {
    public SinVasos(Boolean tieneFlor, Boolean tieneFruto) {
        super(false, false);
    }
}
