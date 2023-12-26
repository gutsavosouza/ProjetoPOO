package item.equipavel.escudo;

import item.equipavel.Equipavel;

public class Escudo extends Equipavel {

    private int nivelEscudo; // 1 ou 2, visto que so tem 2 escudos
    //nivel 1: bloqueia todos os ataques, menos ataques de monstros especificos
    //nivel 2: bloqueia todos os ataques
    // Falta implementar sistema pra checar o nivel do escudo de acordo com o ataque
    // >> ataques nivel 2 so sao bloqueados por escudo nivel 2
    // >> ataques nivel 1 sao bloqueados por todos os escudos


    public Escudo(String nome, double precoCompra, double precoVenda, int nivelEscudo) {
        super(nome, precoCompra, precoVenda, "Escudo");
        this.nivelEscudo = nivelEscudo;
    }

    public int getNivelEscudo() {
        return nivelEscudo;
    }
}
