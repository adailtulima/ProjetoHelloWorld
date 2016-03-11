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
import javax.persistence.ManyToOne;

/**
 *
 * @author adailtonlima
 */
@Entity
public class Veiculo {
    
    @Id
    private Long id; 
    
    @ManyToOne
    private Usuario dono;
    
    @ManyToMany(mappedBy = "viajou")
    private List<Passageiro> passageiros;
    
}
