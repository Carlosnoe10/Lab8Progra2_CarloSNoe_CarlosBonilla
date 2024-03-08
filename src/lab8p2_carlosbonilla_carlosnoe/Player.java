/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_carlosbonilla_carlosnoe;

import java.util.ArrayList;

/**
 *
 * @author lospe
 */
public class Player extends User{
     ArrayList<String> torneos=new ArrayList();

    public Player(String name, String password) {
        super(name, password);
    }

    public ArrayList<String> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<String> torneos) {
        this.torneos = torneos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
