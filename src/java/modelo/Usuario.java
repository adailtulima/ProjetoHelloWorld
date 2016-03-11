/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author adailtonlima
 */
@Entity
public class Usuario {
    
    @Id
    private Long id;
    private String nome;
    
    @OneToMany(mappedBy = "dono")
    private List<Veiculo> veiculos;
    
    
}
