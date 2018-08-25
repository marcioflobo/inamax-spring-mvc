package com.wolf.inamax.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbCarteira")
public class Ocorrencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="cod_negociador")
	private Long codNegociador;
	
	@Column(name="data_acordo")
	private String dataAcordo;
	
	private String cpf;
	
	
	@Column(name="nome_cliente")
	private String nomeCliente;
	
	@Column(name="id_cliente")
	private String idCliente;
	
	private String  telefone;
	
	@Column(name="saldo_devedor")
	private BigDecimal saldoDevedor;
	
	@Column(name="valor_acordo")
	private BigDecimal valorAcordo;
	
	@Column(name="data_vencimento")
	private String dataVencimento;
	
	private Integer parcelas;
	
	@Column(name="valor_entrada")
	private BigDecimal valorEntrada;
	
	@Enumerated(EnumType.STRING)
	private StatusOcorrencia status;
	
	public boolean isDisponivel() {
		return StatusOcorrencia.DISPONIVEL.equals(this.status);
	}
	
	@Column(name="modificaoPor")
	private String modificadoPor;
	
	@Column(name="iniciadoEm")
	private String iniciadoEm;
	
	@Column(name="finalizadoEm")
	private String finalizadoEm;
	
	@Column(name="tipo_negociacao")
	@Enumerated(EnumType.STRING)
	private TipoNegociacao tipoNegociacao;

	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodNegociador() {
		return codNegociador;
	}

	public void setCodNegociador(Long codNegociador) {
		this.codNegociador = codNegociador;
	}

	public String getDataAcordo() {
		return dataAcordo;
	}

	public void setDataAcordo(String dataAcordo) {
		this.dataAcordo = dataAcordo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public BigDecimal getSaldoDevedor() {
		return saldoDevedor;
	}

	public void setSaldoDevedor(BigDecimal saldoDevedor) {
		this.saldoDevedor = saldoDevedor;
	}

	public BigDecimal getValorAcordo() {
		return valorAcordo;
	}

	public void setValorAcordo(BigDecimal valorAcordo) {
		this.valorAcordo = valorAcordo;
	}

	

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}

	public BigDecimal getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(BigDecimal valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	public StatusOcorrencia getStatus() {
		return status;
	}

	public void setStatus(StatusOcorrencia status) {
		this.status = status;
	}

	public String getModificadoPor() {
		return modificadoPor;
	}

	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	public String getIniciadoEm() {
		return iniciadoEm;
	}

	public void setIniciadoEm(String iniciadoEm) {
		this.iniciadoEm = iniciadoEm;
	}

	public String getFinalizadoEm() {
		return finalizadoEm;
	}

	public void setFinalizadoEm(String finalizadoEm) {
		this.finalizadoEm = finalizadoEm;
	}

	public TipoNegociacao getTipoNegociacao() {
		return tipoNegociacao;
	}

	public void setTipoNegociacao(TipoNegociacao tipoNegociacao) {
		this.tipoNegociacao = tipoNegociacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ocorrencia other = (Ocorrencia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
		
}
