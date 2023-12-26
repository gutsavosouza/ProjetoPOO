package ataque;

import entidade.Entidade;
import item.equipavel.arma.Arma;

public abstract class Ataque {

    public abstract void atacar(Arma armaUsada, Entidade alvo);
}