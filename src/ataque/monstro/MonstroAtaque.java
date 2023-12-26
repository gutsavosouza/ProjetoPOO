package ataque.monstro;

import ataque.Ataque;
import entidade.Entidade;
import item.equipavel.arma.Arma;

public class MonstroAtaque extends Ataque {

    private int dano;

    public MonstroAtaque(int dano) {
        this.dano = dano;
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        alvo.receberDano(this.dano);
    }

    public int getDano() {
        return dano;
    }
}
