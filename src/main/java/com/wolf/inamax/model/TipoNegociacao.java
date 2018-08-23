package com.wolf.inamax.model;

public enum TipoNegociacao {

	PARCELAMENTO("Parcelamento"),
	PROMESSA_PAGAMENTO("Promessa de Pagamento");
	
	
	private String descricao;
	
	private TipoNegociacao(String descricao) {
		
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
