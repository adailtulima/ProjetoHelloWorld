/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cachorro extends Animal{

  private boolean lateMuito;
  
  @OneToMany(mappedBy = "cachorro")
  private List<Vacina> vacinas;

    public boolean isLateMuito() {
        return lateMuito;
    }

    public void setLateMuito(boolean lateMuito) {
        this.lateMuito = lateMuito;
    }

    public List<Vacina> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<Vacina> vacinas) {
        this.vacinas = vacinas;
    }
  
  
    
}
