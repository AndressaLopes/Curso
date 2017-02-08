package Pratica10;

public class Conta {

	Integer agencia;
	Integer numero;
	Double saldo;

	public Conta() {
		super();
	}
	
	public Conta(Integer agencia, Integer numero, Double saldo) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void deposita(){
		
	}
	
	public void saca(){
		
	}
}
