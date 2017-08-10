package br.edu.ifpe.AgendaVirtual.controller;
import java.util.List;
import br.edu.ifpe.AgendaVirtual.model.entity.Anotacao;
import br.edu.ifpe.AgendaVirtual.model.entity.Disciplina;
import br.edu.ifpe.AgendaVirtual.persistencia.implementacoes.FabricaRepositorio;
import br.edu.ifpe.AgendaVirtual.persistencia.generico.RepositorioGenerico;

public class Fachada {
	private static Fachada myself = null;
	private RepositorioGenerico<Anotacao, Integer> repositorioAnotacao=null;
	private RepositorioGenerico<Disciplina, Integer> repositorioDisciplina=null;


	public Fachada(){
		this.repositorioAnotacao = FabricaRepositorio.fabricarRepositorio(FabricaRepositorio.Anotacao, FabricaRepositorio.BD);
		this.repositorioDisciplina = FabricaRepositorio.fabricarRepositorio(FabricaRepositorio.Disciplina, FabricaRepositorio.BD);

	}


	public static Fachada getInstance(){
		if(myself==null)
			myself = new Fachada();

		return myself;
	}

	public void inserirAnotacao(Anotacao anotacao){
		this.repositorioAnotacao.inserir(anotacao);
	}
	public void alterarAnotacao(Anotacao anotacao){
		this.repositorioAnotacao.alterar(anotacao);
	}

	public Anotacao recuperarAnotacao(int id){
		return this.repositorioAnotacao.recuperar(id);
	}

	public void excluirAnotacao(Anotacao anotacao){
		this.repositorioAnotacao.excluir(anotacao);
	}

	public List<Anotacao> recuperarTodosAnotacao(){
		return this.repositorioAnotacao.recuperarTodos();
	}
	
	
	
	public void inserirDisciplina(Disciplina disciplina){
		this.repositorioDisciplina.inserir(disciplina);
	}
	public void alterarAnotacao(Disciplina disciplina){
		this.repositorioDisciplina.alterar(disciplina);
	}

	public Disciplina recuperarDisciplina(int id){
		return this.repositorioDisciplina.recuperar(id);
	}

	public void excluirDisciplina(Disciplina disciplina){
		this.repositorioDisciplina.excluir(disciplina);
	}

	public List<Disciplina> recuperarTodosDisciplina(){
		return this.repositorioDisciplina.recuperarTodos();
	}


}