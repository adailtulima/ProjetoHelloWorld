package beans;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Weslley
 */
public class NavegacaoMB implements Serializable {

    private static final long serialVersionUID = 1L;

    public void voltarInicio() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();

        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/correcao.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String irPaginaLogoff() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/index.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public void irTelaCorrecao() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/correcao.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaGerenciaPreCadastro() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/gerencia-pre-cadastro.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaGerenciaCreditos() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/gerencia-creditos-alunos.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaRelatorio() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/relatorio.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaListaProvas() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/provas.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaListaProfessores() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/professores.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaListaDiretores() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/diretores.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaCadProfessor() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/cadastro-professor-novo.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaCadDiretor() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/cadastro-diretor-novo.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaCadTema() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/cadTema.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaListaTemas() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/temas.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaDetalhesTema() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/detalhes-tema.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaDetalhesTemaProfessor() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/detalhes-tema-professor.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaReimpressaoProva() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/reimpressao.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public void irTelaTodasRedacoes() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/redacoes.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaDashboardRelatorioAvaliacoesEscolas() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/relatorio-escola-avaliacoes.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaDashboardRelatorioAvaliacoesProfessor() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/relatorio-professor-avaliacoes.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public void irTelaDashboardRelatorioEscolas() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/relatorio-escola.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaDashboardRelatorioTemas(){
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/relatorio-tema.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaDashboardRelatorioDatas() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/relatorio-data.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public void irTelaDelegaRedacao() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/delegar-redacao.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaVisualizaImagemTema() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/visualizar-imagem-tema.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaCadastroEscola() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/cadastro-escola.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaEdicaoEscola() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/visualizar-escola.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaCadastroTurma() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/cadastro-turma.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaCadastroConteudo() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/cadastro-conteudo.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaCadastroAlunoComCodigo() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/registro-aluno-codigo.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaCadastroAluno() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/cadastro-aluno.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void irTelaCadastroAlunoSimplificado() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/cadastro-aluno-simplificado.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void irTelaImportacaoAlunos() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/importacao-alunos.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaEdicaoAluno() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/visualizar-aluno.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void irTelaEdicaoTurma() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/visualizar-turmas.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaEdicaoConteudo() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/visualizar-conteudos.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaCadastroProfessor() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/cadastro-professor-novo.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irTelaEdicaoProfessor() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/visualizar-professor.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaRelatorioEscola() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/relatorio-escola.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaRelatorioTema() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/relatorio-tema.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void irTelaRelatorioData() {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
        try {
            externalContext.redirect(externalContext.getRequestContextPath()
                    + "/relatorio-data.jsf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public void irRegistroAlunoCodigo() {
    	ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
    	try {
    		externalContext.redirect(externalContext.getRequestContextPath()
                    + "/registro-aluno-codigo.jsf");
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    
    public void irTelaDashboardRankingAlunos() {
    	ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
    	try {
    		externalContext.redirect(externalContext.getRequestContextPath()
                    + "/ranking-alunos.jsf");
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    public void irTelaCadastroPacote() {
    	ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
    	try {
    		externalContext.redirect(externalContext.getRequestContextPath()
                    + "/cadastro-pacote.jsf");
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }

    public void irTelaVisualizarPacote() {
    	ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();
    	try {
    		externalContext.redirect(externalContext.getRequestContextPath()
                    + "/visualizar-pacotes.jsf");
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }    
    
}
