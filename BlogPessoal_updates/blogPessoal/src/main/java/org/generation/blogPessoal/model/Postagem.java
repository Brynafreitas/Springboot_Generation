package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="postagem")

public class Postagem {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY) //chave primaria
	private long id;
	
	@NotNull  //titulo não pode ficar vazio
	@Size(min= 5, max=100)  //quantidade de caracteres do titulo
	private String titulo;
	
	@NotNull
	@Size (min= 10, max =500)
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP) //qual tipo de tempo
	private Date date = new java.sql.Date(System.currentTimeMillis()); //vai colocar a data que o dado passou por essa classe

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
