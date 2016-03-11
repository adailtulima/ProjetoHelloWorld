/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author adailtonlima
 */
@Entity
public class Passageiro {


    @Id
    private Long id;  
    
    @ManyToMany
    private List<Veiculo> viajou;
    
    
}
