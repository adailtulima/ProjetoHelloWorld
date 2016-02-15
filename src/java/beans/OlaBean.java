package beans;

import dao.CachorroDAO;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import modelo.Cachorro;

@ManagedBean(name = "hbean")
@SessionScoped
public class OlaBean {
    
    
    @Inject
    private CachorroDAO cdao;
    
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
        
        Random randomGenerator = new Random();
        
        Cachorro c = new Cachorro();
        
        c.setDono("Adailton");
        c.setIdade(randomGenerator.nextInt());// gera uma idade aleatoria
        c.setLateMuito(false);
        c.setRaca("viraLata + "+System.currentTimeMillis());
        
        cdao.inserir(c);
        
        //cdao.remover(c);
        
        
    }

    public CachorroDAO getCdao() {
        return cdao;
    }

    public void setCdao(CachorroDAO cdao) {
        this.cdao = cdao;
    }
    
    
}
