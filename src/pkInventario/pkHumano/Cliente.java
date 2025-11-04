package pkInventario.pkHumano;

public class Cliente extends Persona{
public Cliente(){
    super();
}

public String retirar(){
    String frase = "El cliente ha retirado las frutas que visualizó.";
    return frase;
}
public String visualizar(){
    String frase = "El cliente revisó las frutas que necesita.";
    return frase;
}

}
