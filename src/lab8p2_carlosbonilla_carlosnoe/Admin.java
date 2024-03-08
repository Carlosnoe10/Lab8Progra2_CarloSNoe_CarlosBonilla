/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_carlosbonilla_carlosnoe;

import java.io.Serializable;

/**
 *
 * @author lospe
 */
public class Admin extends User implements Serializable{
     int torneosCreados;

    public Admin(int torneosCreados, String name, String password) {
        super(name, password);
        this.torneosCreados = torneosCreados;
    }

    public int getTorneosCreados() {
        return torneosCreados;
    }

    public void setTorneosCreados(int torneosCreados) {
        this.torneosCreados = torneosCreados;
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
