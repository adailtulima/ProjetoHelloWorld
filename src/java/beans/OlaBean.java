package beans;

import dao.CachorroDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Cachorro;

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
    
    
    public void salvarCachorro(){
        
        CachorroDAO cDAO = new CachorroDAO();
        
        Cachorro c = new Cachorro();
        c.setDono("Adailton");
        c.setIdade(2);
        c.setLateMuito(true);
        c.setRaca("viraLata");
        
        cDAO.inserir(c);
        
        cDAO.remover(c);
        
        
    }
}
