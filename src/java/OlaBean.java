import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "hbean")
@SessionScoped
public class OlaBean {
    
    private String textoEntrada;
    private String textoSaida="Valor Padrão Inicial" ;
    
    public void dizerAlo(){
            this.textoSaida = textoSaida +" ==|== " + textoEntrada;
    }
    public String getTextoEntrada() {
        return textoEntrada;
    }
    public void setTextoEntrada(String textoEntrada) {
        this.textoEntrada = textoEntrada;
    }
    public String getTextoSaida() {
        return textoSaida;
    }
    public void setTextoSaida(String textoSaida) {
        this.textoSaida = textoSaida;
    }    
}
