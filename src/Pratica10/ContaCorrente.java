package Pratica10;

public class ContaCorrente extends Conta implements Autenticavel{

	Double limite;
	
	public ContaCorrente() {
		super();
	}
	
	public boolean autentica(int senha){
		
		if(senha == 123456789){
			System.out.println("Acesso Permitido!");
			return true;
		}else{
			System.out.println("Acesso Negado!");
			return false;
		}
		
	}
	
	public Double getSaldo(){
		return saldo = saldo + limite;
	}

	public ContaCorrente(Double limite) {
		super();
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
}