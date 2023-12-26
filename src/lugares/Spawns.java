package lugares;

import npc.monstro.*;
import npc.monstro.boss.*;
import npc.monstro.miniboss.*;

import java.util.Scanner;

public class Spawns {
    
    private Monstro monstro = new SemMonstro();
    
    private final Scanner scIn = new Scanner(System.in);
    
    public Monstro Spawn(String Lugar){
        int Escolha = 0;
        if(Lugar == "Casa do Link"){
            System.out.println("Sem Monstros");
            return monstro;
        }
        if(Lugar == "Bosque Assombrado"){
            System.out.println("1- Bawb");
            System.out.println("2- Solider");
            System.out.println("3- Bee");
            System.out.println("4- Crow");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                     monstro = new Bawb();
                    return monstro;
                case 2:
                    monstro = new Solider();
                    return monstro;
                case 3:
                    monstro = new Bee();
                    return monstro;
                case 4:
                    monstro = new Crow();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");
                    return monstro;
            }
        }
        if(Lugar == "Cartomante"){
            System.out.println("Sem Monstros");
            return monstro;
        }
        if(Lugar == "Casa da Bruxa"){
            System.out.println("1- Moblin");
            System.out.println("2- Leever");
            System.out.println("3- Ropa");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new Moblin();
                    return monstro;
                case 2:
                    monstro = new Leever();
                    return monstro;
                case 3:
                    monstro = new Ropa();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");      
                    return monstro;
            }
        }
        if(Lugar == "Casa de Gales 1 Andar"){
            System.out.println("1- Gigabari");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new Gigabari();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!"); 
                    return monstro;
            }
        }
        if(Lugar == "Casa de Gales 2 Andar"){
            System.out.println("1- Margomill");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new Margomill();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");     
                    return monstro;
            }
        }
        if(Lugar == "Casa Do Mineiro"){
            System.out.println("1- Armos");
            System.out.println("2- Arrgi");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new Armos();
                    return monstro;
                case 2:
                    monstro = new Arrgi();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");  
                    return monstro;
            }
        }
        if(Lugar == "Casa do Ravio"){
            System.out.println("Sem Monstros");
            return monstro;
        }
        if(Lugar == "Castelo de Hyrule"){
            System.out.println("1- Blue Sword Soldier");
            System.out.println("2- Lorule Solider");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new BlueSwordSoldier();
                    return monstro;
                case 2:
                    monstro = new LoruleSolider();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");  
                    return monstro;
            }
        }
        if(Lugar == "Castelo de Hyrule 1 Andar"){
            System.out.println("1- Red Stalfos");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new RedStalfos();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!"); 
                    return monstro;
            }
        }
        if(Lugar == "Castelo de Hyurle 2 Andar"){
            System.out.println("1- Yuga Ganon");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new YugaGanon();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");    
                    return monstro;
            }
        }
        if(Lugar == "Cemiterio"){
            System.out.println("1- Big Ice Gimos");
            System.out.println("2- Blob");
            System.out.println("3- Dark Ghini");
            System.out.println("4- Blue Euegore");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new BigIceGimos();
                    return monstro;
                case 2:
                    monstro = new Blob();
                    return monstro;
                case 3:
                    monstro = new DarkGhini();
                    return monstro;
                case 4:
                    monstro = new BlueEyegore(); 
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");  
                    return monstro;
            }
        }
        if(Lugar == "Deserto do Misterio"){
            System.out.println("1- Dead Rock");
            System.out.println("2- Flamora");
            System.out.println("3- Gyorm");
            System.out.println("4- Sand Crab");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new Deadrock();
                    return monstro;
                case 2:
                    monstro = new Flamora();
                    return monstro;
                case 3:
                    monstro = new Gyorm();
                    return monstro;
                case 4:
                    monstro = new SandCrab();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!"); 
                    return monstro;
            }
        }
        if(Lugar == "Dominio Zora"){
            System.out.println("1- Ice Wizzrobe");
            System.out.println("2- Hinox");
            System.out.println("3- Big Pengator");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new IceWizzrobe();
                    return monstro;
                case 2:
                    monstro = new Hinox();
                    return monstro;
                case 3:
                    monstro = new BigPengator();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");     
                    return monstro;
            }
        }
        if(Lugar == "Floresta Perdida"){
            System.out.println("1- Crow");
            System.out.println("2- Rat");
            System.out.println("3- Keeleon");
            System.out.println("4- Keese");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new Crow();
                    return monstro;
                case 2:
                    monstro = new Rat();
                    return monstro;
                case 3:
                    monstro =new Keeleon();
                    return monstro;
                case 4:
                    monstro = new Keese();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");  
                    return monstro;
            }
        }
        if(Lugar == "Forja do Ferreiro"){
            System.out.println("Sem Monstros");
            return monstro;
        }
        if(Lugar == "Lago Hylia"){
            System.out.println("1- Big Ice Gimos");
            System.out.println("2- Blob");
            System.out.println("3- Leever");
            System.out.println("4- Octorok");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new BigIceGimos()
;                    return monstro;
                case 2:
                    monstro = new Blob();
                    return monstro;
                case 3:
                    monstro =new Leever();
                    return monstro;
                case 4:
                    monstro = new Octorok();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");
                    return monstro;                    
            }
        }
        if(Lugar == "Loja Itens"){
            System.out.println("Sem Monstros");
            return monstro;
        }
        if(Lugar == "Montana da Morte"){
            System.out.println("1- Lynel");
            System.out.println("2- Red Goriya");
            System.out.println("3- Red Kodongo");
            System.out.println("4- Taros");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new Lynel();
                    return monstro;
                case 2:
                    monstro = new RedGoriya();
                    return monstro;
                case 3:
                    monstro = new RedKodongo();
                    return monstro;
                case 4:
                    monstro = new Taros();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!"); 
                    return monstro;
            }
        }
        if(Lugar == "Palacio do Deserto 1 Andar"){
            System.out.println("1- Heedle");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new Heedle();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!"); 
                    return monstro;
            }
        }
        if(Lugar == "Palacio do Deserto 2 Andar"){
            System.out.println("1- Zaganaga");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new Zaganaga();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!"); 
                    return monstro;
            }
        }
        if(Lugar == "Palácio Oriental 1 Andar"){
            System.out.println("1- Lorule Ball");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new LoruleBall();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!"); 
                    return monstro;
            }
        }
        if(Lugar == "Palacio Oriental 2 Andar"){
            System.out.println("1- Yuga");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new Yuga();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");    
                    return monstro;
            }
        }
        if(Lugar == "Quintal do Link"){
            System.out.println("Sem Monstros");
            return monstro;
        }
        if(Lugar == "Ruínas Orientais"){
            System.out.println("1- Poe");
            System.out.println("2- Ropa");
            System.out.println("3- Moblin");
            System.out.println("4- Armos");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new Poe();
                    return monstro;
                case 2:
                    monstro = new Ropa();
                    return monstro;
                case 3:
                    monstro = new Moblin();
                    return monstro;
                case 4:
                    monstro =  new Armos();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");  
                    return monstro;
            }
        }
        if(Lugar == "Ruinas do Sul"){
            System.out.println("1- Big Ice Gimos");
            System.out.println("2- Blob");
            System.out.println("3- Ice Wizzrobe");
            System.out.println("4- Arrgi");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new BigIceGimos();
                    return monstro;
                case 2:
                    monstro = new Blob();
                    return monstro;
                case 3:
                    monstro = new IceWizzrobe();
                    return monstro;
                case 4:
                    monstro = new Arrgi();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");
                    return monstro;
            }
        }
        if(Lugar == "Santuario"){
            System.out.println("Sem Monstros");
            return monstro;
        }
        if(Lugar == "Torre de Hera 1 Andar"){
            System.out.println("1- Lorule Ball");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new LoruleBall();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");    
                    return monstro;
            }
        }
        if(Lugar == "Torre de Hera 2 Andar"){
            System.out.println("1- Molform");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return monstro;
                case 1:
                    monstro = new Moldorm();
                    return monstro;
                default:
                    System.out.println("Opcao invalida!");   
                    return monstro;
            }
        }
        if(Lugar == "Vila Kakariko"){
            System.out.println("Sem Monstros");
            return monstro;
        }
        
        return null;
    }
}
