package com.accenture.academico.model;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Conta implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;

	@Column
	private Long idAgencia;

	@Column
	private Long idConta;

	@Temporal(TemporalType.DATE)
	Date DataAbertura;

	protected Long numero;
	protected float saldo;
	float valor;
	private boolean validarConta;

	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(Long idAgencia) {
		this.idAgencia = idAgencia;
	}
	public Long getIdConta() {
		return idConta;
	}
	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getDataAbertura() {
		return DataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		DataAbertura = dataAbertura;
	}
	public boolean isValidarConta() {
		return validarConta;
	}
	public void setValidarConta(boolean validarConta) {
		this.validarConta = validarConta;
	}
	public static List<Conta> getAllContas() {
		return null;
	}
    public static void saveOrUpdate(Conta conta) {
    }
}

