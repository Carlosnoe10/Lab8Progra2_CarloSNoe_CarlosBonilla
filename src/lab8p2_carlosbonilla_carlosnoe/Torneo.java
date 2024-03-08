/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_carlosbonilla_carlosnoe;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author lospe
 */
class Torneo implements Serializable{
    String name;
    Player winner;
    ArrayList <Player> participantes=new ArrayList();
    boolean flag;

    public Torneo(String name, Player winner, boolean flag) {
        this.name = name;
        this.winner = winner;
        this.flag = flag;
    }

    public Torneo(String name) {
        this.name = name;
        this.flag = true;
    }



    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public ArrayList<Player> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Player> participantes) {
        this.participantes = participantes;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
