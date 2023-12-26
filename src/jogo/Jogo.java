package jogo;

import drop.Drop;
import entidade.Entidade;
import entidade.Jogador;
import item.Item;
import lugares.CasaLink;
import lugares.Lugar;
import npc.monstro.Monstro;

import java.util.Scanner;

public class Jogo {

    private Jogador usuario = new Jogador("SemNome");
    private final Scanner scIn = new Scanner(System.in);
    private boolean jogoAberto = false;

    private final Drop drops = new Drop();
    private Lugar Lugar  = new CasaLink();
    
    public Jogo() {
        initJogador();
        jogoAberto = true;
    }

    public void fechar(){
        System.out.println("Jogo encerrado. ");
        contagemObjetos();
        this.usuario = null;
        this.scIn.close();
        jogoAberto = false;
    }

    private void contagemObjetos(){
        System.out.println("Contagem de objetos:\nEntidades: " + Entidade.getCont() + ", Itens: " + Item.getCont() + " \n");
    }

    private void initJogador(){
        System.out.println("Insira o nome do seu jogador: ");
        String nome = scIn.nextLine();
        this.usuario.alterarNome(nome);
    }

    private void printDadosBatalha(Jogador jogador, Monstro monstro){
        System.out.println("Jogador>>\nVida: " + jogador.getVida() + "   Energia: " + jogador.getEnergia());
        System.out.println("Monstro>>\nVida: " + monstro.getVida());
    }

    public void batalha(Monstro monstro){
        if( monstro.getVida() < 1){
            return;
        }
        System.out.println("Batalha iniciada contra " + monstro.getEspecie());
        printDadosBatalha(this.usuario, monstro);
        do{
            if(this.usuario.estaMorto()){
                System.out.println("O jogador morreu, batalha encerrada");
                return;
            }

            int escolhaUsuario = 0;
            System.out.println(this.usuario.getNomeUsuario() + " escolha o que irá fazer: \n1- Atacar \n2- Defender \n3- Atacar usando arma primaria \n4- Atacar usando arma secundaria\n5- Abrir inventario");
            escolhaUsuario = Integer.parseInt(scIn.nextLine());

            switch (escolhaUsuario) {
                case 1:
                    this.usuario.atacarEspada(monstro);
                    break;
                case 2:
                    this.usuario.escudo();
                    break;
                case 3:
                    this.usuario.atacarPrimaria(monstro);
                    break;
                case 4:
                    this.usuario.atacarSecundaria(monstro);
                    break;
                case 5:
                    System.out.println(this.usuario.invToString());
                    System.out.println("Escolha qual pocao quer usar: ");

                    int pocaoEscolha = Integer.parseInt(scIn.nextLine());

                    this.usuario.usarPocao(pocaoEscolha);
                    break;
                default:
                    System.out.println("Escolha inválida, o jogador perdeu o turno");
            }

            if(monstro.estaMorto()){
                System.out.println("O monstro inimigo morreu, batalha encerrada");
                if( monstro.getEspecie() == "Sem Monstro"){
                    return;
                }else{
                    drops.dropar(monstro.getTipo(), usuario.getInventario());
                    drops.dropar(usuario.getInventario(), usuario);
                    drops.dropar(usuario);
                    return;
                }
            }
            monstro.atacar(this.usuario);
            this.usuario.setEstaDefendendo(false);
            printDadosBatalha(this.usuario, monstro);
        }while(!this.usuario.estaMorto() || !monstro.estaMorto());
    }

    public void menuUsuario(){
        int escolhaUsuario;
        int armaEscolha = 0;
        do{
            System.out.println(this.Lugar.getNome());
            this.usuario.mostrarEquipamentos();
            System.out.println(this.usuario.invToString());
            System.out.println("MENU DE ESCOLHAS DO USUARIO:\n1- Usar poção\n2- Trocar arma primária\n3- Trocar arma secundária\n4- Mudar de Lugar\n5- Batalhar com Monstro\n6- Falar com Personagem\n0- Fechar o menu");
            Lugar.Acoes();
            escolhaUsuario = Integer.parseInt(scIn.nextLine());
            switch(escolhaUsuario){
                case 0:
                    System.out.println("Menu fechado.");
                    this.fechar();
                    return;
                case 1:
                    System.out.println("Escolha qual pocao quer usar: ");
                    int pocaoEscolha = Integer.parseInt(scIn.nextLine());
                    this.usuario.usarPocao(pocaoEscolha);
                    break;
                case 2:
                    System.out.println("Escolha qual o slot da arma quer equipar como primaria: ");
                    armaEscolha = Integer.parseInt(scIn.nextLine());
                    this.usuario.trocarArmaPrimaria(armaEscolha);
                    break;
                case 3:
                    System.out.println("Escolha qual o slot da arma quer equipar como secundaria: ");
                    armaEscolha = Integer.parseInt(scIn.nextLine());
                    this.usuario.trocarArmaSecundaria(armaEscolha);
                    break;
                case 4:
                    Lugar = Lugar.Lugares(usuario.getInventario());
                    break;
                case 5:
                    batalha(Lugar.Monstros());
                    break;
                case 6:
                    Lugar.Personagens();
                    break;
                default:
                    System.out.println("Opção inválida, menu fechado");
                    this.fechar();
            }
        }while(jogoAberto);
    }


    public static void main(String[] args){
        Jogo jogo = new Jogo();

        jogo.menuUsuario();

    }
}
