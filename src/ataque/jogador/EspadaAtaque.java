package ataque.jogador;

import entidade.Entidade;
import item.equipavel.arma.Arma;

public class EspadaAtaque extends JogadorAtaque {

    public EspadaAtaque() {
        super(0);
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        System.out.println("Jogador ataca usando sua espada");
        super.atacar(armaUsada, alvo);
    }
}
