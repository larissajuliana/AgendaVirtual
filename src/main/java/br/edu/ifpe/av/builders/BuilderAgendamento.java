package br.edu.ifpe.av.builders;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.hibernate.dialect.DB2390Dialect;

import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.Usuario;


@ManagedBean(name = "bAgendamento")
@RequestScoped
public class BuilderAgendamento {
	
	private int id;
	private String atividade;
	private Date dataHora;
	private String descricao;
	private Disciplina nome;
	private Usuario usuario;
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Disciplina getNome() {
		return nome;
	}
	public void setNome(Disciplina nome) {
		this.nome = nome;
	}
	
	public BuilderAgendamento(){
	}
	
	public BuilderAgendamento(int id, String atividade, Date dataHora, String descricao, Disciplina nome, Usuario usuario){
		this.id = id;
		this.atividade = atividade;
		this.dataHora = dataHora;
		this.descricao = descricao;
		this.nome = nome;
		this.usuario = usuario;
	}
	
	public Agendamento construirAgendamento(){
		return new Agendamento(id, atividade, dataHora, descricao, nome, usuario); 
	}
	

}