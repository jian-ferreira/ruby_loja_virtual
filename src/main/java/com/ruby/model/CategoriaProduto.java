package com.ruby.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "categoria_produto")
@SequenceGenerator(name = "seq_categoria_produto", sequenceName = "seq_categoria_produto", allocationSize = 1, initialValue = 1)
public class CategoriaProduto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_categoria_produto")
	private Long id;
	@Column
	private String nomeDaDescricao;

	public Long getIdCAtegoriaProduto() {
		return id;
	}

	public void setIdCAtegoriaProduto(Long idCAtegoriaProduto) {
		this.id = idCAtegoriaProduto;
	}

	public String getNomeDaDescricao() {
		return nomeDaDescricao;
	}

	public void setNomeDaDescricao(String nomeDaDescricao) {
		this.nomeDaDescricao = nomeDaDescricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaProduto other = (CategoriaProduto) obj;
		return Objects.equals(id, other.id);
	}

}
