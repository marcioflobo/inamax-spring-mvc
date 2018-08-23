package com.wolf.inamax.model;

public enum StatusOcorrencia {

	EM_ANDAMENTO("Em Andamento"),
	ENCERRADO("Encerrado"),
	DISPONIVEL("Disponivel");
	
	private String descricao;
	
	private StatusOcorrencia(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
