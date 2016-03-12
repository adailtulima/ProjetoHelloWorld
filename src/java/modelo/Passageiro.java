/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author adailtonlima
 */
@Entity
public class Passageiro {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;  
    
    @ManyToMany
    private List<Veiculo> viajou;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Veiculo> getViajou() {
        return viajou;
    }

    public void setViajou(List<Veiculo> viajou) {
        this.viajou = viajou;
    }
    
    
    
    
}
