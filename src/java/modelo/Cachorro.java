
package modelo;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Cachorro extends Animal {

  private boolean lateMuito;
  
  @OneToMany(mappedBy = "cachorro")
  private List<Vacina> vacinas;

  public Cachorro(){
        vacinas = new ArrayList<Vacina>();
  }
  
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
