package lugares;

import java.util.Scanner;
import npc.monstro.boss.Yuga;
import npc.personagem.Ganon;
import npc.personagem.PrincesaHilda;
import npc.personagem.PrincesaZelda;
import npc.personagem.Ravio;
import npc.personagem.Sheerow;
import npc.personagem.YugaPersonagem;

public class Personagens {
    
    private final Scanner scIn = new Scanner(System.in);
    
    public void Personagens(String Lugar){
        int Escolha = 0;
        if(Lugar == "Casa do Ravio"){
            System.out.println("1- Falar com Ravio");
            System.out.println("2- Falar com Sheerow");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    break;     
                case 1:
                    Ravio ravio = new Ravio();
                    ravio.fala();
                    break;
                case 2:
                    Sheerow sheerow = new Sheerow();
                    sheerow.fala();
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            return;
        }
        if(Lugar == "Cartomante"){
            System.out.println("1- Falar com Yuga");
            System.out.println("2- Falar com Ganon");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    break;     
                case 1:
                    YugaPersonagem yuga = new YugaPersonagem();
                    yuga.fala();
                    break;
                case 2:
                    Ganon ganon = new Ganon();
                    ganon.fala();
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            return;
        }
        if(Lugar == "Santuario"){
            System.out.println("1- Falar com Princesa Hilda");
            System.out.println("2- Falar com Princesa Zelda");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    break;     
                case 1:
                    PrincesaHilda hilda = new PrincesaHilda();
                    hilda.fala();
                    break;
                case 2:
                    PrincesaZelda zela = new PrincesaZelda();
                    zela.fala();
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            return;
        }
        return;
    }
}
