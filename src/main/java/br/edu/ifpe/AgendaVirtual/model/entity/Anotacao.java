package br.edu.ifpe.AgendaVirtual.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Anotacao {
	
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String texto;
	@Column
	private Date data;
	@ManyToOne
	@JoinColumn(name="anotacao_id", updatable=false)
	private Usuario usuario;
	
	
	public Anotacao(int id, String texto, Date data, Usuario usuario) {
		super();
		this.id = id;
		this.texto = texto;
		this.data = data;
		this.usuario = usuario;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}