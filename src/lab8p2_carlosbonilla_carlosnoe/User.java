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
public class User implements Serializable{
        String name;
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
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

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", password=" + password + '}';
    }
    
}
/*
Jlist lista=new Jlist();
m=lista.(DefaultListModel)lista.getmodel();
for (int i=0;i<Usuarios.getSize();i++){
m.addelement(Usuarios.get(i));
}
lista.setModel(m);
add.list;



*/