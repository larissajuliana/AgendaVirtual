package br.edu.ifpe.AgendaVirtual.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpe.AgendaVirtual.model.entity.Anotacao;
import br.edu.ifpe.AgendaVirtual.persistencia.generico.RepositorioGenerico;
import br.edu.ifpe.AgendaVirtual.persistencia.implementacoes.FabricaRepositorio;

@ManagedBean(name = "anotacaoController")
@SessionScoped
public class AnotacaoController {

	RepositorioGenerico<Anotacao, Integer> repositorioAnotacao = null;

	private Anotacao selecionar;

	public Anotacao getSelecionar() {
		return selecionar;
	}

	public void setSelecionar(Anotacao selecionar) {
		this.selecionar = selecionar;
	}

	public AnotacaoController() {
		this.repositorioAnotacao = FabricaRepositorio.fabricarRepositorio(FabricaRepositorio.Anotacao,
				FabricaRepositorio.BD);
	}

	public String inserir(Anotacao anotacao) {
		
		try {
		this.repositorioAnotacao.inserir(anotacao);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A anotacao foi inserida!"));
		} catch(Exception x) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(x.getMessage()));
		}
		return "ApresentarAnotacao.xhtml";
	}

	public String alterar(Anotacao anotacao) {
		this.repositorioAnotacao.alterar(anotacao);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A anota��o foi alterada!"));

		return "ApresentarAnotacao.xhtml";
	}

	public Anotacao recuperarAnotacao(int id) {
		return this.repositorioAnotacao.recuperar(id);
	}

	public void excluir(Anotacao anotacao) {
		this.repositorioAnotacao.excluir(anotacao);
	}

	public List<Anotacao> recuperarTodosAnotacao() {
		return this.repositorioAnotacao.recuperarTodos();
	}

}
