/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Entity;


@Entity
public class Galinha extends Animal {
    
    private boolean angola=false;
    private boolean botaOvo=true;

    public Galinha(){
    
    }
    public boolean isAngola() {
        return angola;
    }

    public void setAngola(boolean angola) {
        this.angola = angola;
    }

    public boolean isBotaOvo() {
        return botaOvo;
    }

    public void setBotaOvo(boolean botaOvo) {
        this.botaOvo = botaOvo;
    }
    
    
    
}
