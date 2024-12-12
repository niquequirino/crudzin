package com.tiktok.user.model;


import com.exemple.tiktok.user.dto.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; //importações das anotações que usei

@Entity
@Table(name = "tk_usuario")
public class UsuarioModel {
	
 private String titulo,descricao,user;
public UsuarioModel() {
	 }
 
public UsuarioModel(UsuarioDTO user) {
	
	this.id = user.id() ;
	this.titulo = user.titulo();
	this.descricao = user.descricao();
	this.user = user.user(); // atributos

}

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) //indica que o valor do id será gerado automaticamente
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;     //aperta botao dirreito e source, vai em getters e setters e selecionei tudo
	}
}
	

