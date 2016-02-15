/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.CachorroDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import modelo.Cachorro;

@ManagedBean(name = "cadCachorro")
@SessionScoped
public class CadCachorroBean extends AbstractMB{
    
    @Inject
    private CachorroDAO cdao;
    
    private Cachorro cachorro = new Cachorro();    

    private String mensagem;
    
    public Cachorro getCachorro() {
        return cachorro;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }
    
    public void salvarCachorro(){
    
       cdao.inserir(cachorro);
       
       super.displayInfoMessageToUser("Cadastro Realizado com Sucesso!");
       
       
    }
    
    
}
