package com.ruby.enums;

public enum TipoEndereco {

	ENDERECO_DE_ENTREGA("Endereço de Entrega"),
	ENDERECO_DE_COBRANCA("Endereço de Cobrança");

	/**
	 * O enum exige que, para que cada argumento que inserimos na constante façamos
	 * uma descrição pra representá-lo.
	 */
	private String descricao;

	private TipoEndereco(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return "Tipo de endereço: " + this.descricao;
	}

}
