/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npc.monstro;

import ataque.monstro.ArrgiAtaque;

/**
 * @author vrm
 */
public class Arrgi extends Monstro {

    public Arrgi() {
        super(8, "Arrgi","Comum", new ArrgiAtaque());
    }

}
