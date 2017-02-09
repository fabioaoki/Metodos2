package Metodos2;

class Cliente {
	String nome;
	String sobrenome;
	String cpf;
}

class Conta {
	int numero; 
	String dono;
	double saldo;
	double limite;
	double agencia;
	float numeroDaConta;
	Cliente titular = new Cliente(); //Quando chamarem um new conta, havera um new cliente para ele.
	
	//outros atributos
	
	//Outro atributo e metodo
	
	void deposita (double quantidade) {
		this.saldo += quantidade;
	}
	
	// Outro metodo e atributos 
	
	boolean saca (double valor) {
		if (this.saldo < valor) {
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
}

public class Metodos2 {
	
	public static void main(String[] args) {

	  Conta minhaConta = new Conta();
	  Cliente c = new Cliente();
	  minhaConta.titular = c;
		     
	//	Criando conta
	
	// Alterando valores minhaConta 
	minhaConta.dono = "Fabio";
	minhaConta.saldo = 1000.0;
	minhaConta.agencia = 1456;
	minhaConta.numeroDaConta = 124515-5;
	minhaConta.limite = 5000.0;
	
	//Outra conta
	
	Conta meuSonho;
	meuSonho = new Conta();
	meuSonho.saldo = (15000);
	
//	boolean consegui = minhaConta.saca(1000);
//		 if (minhaConta.saca(2000)) {
//			System.out.println("Consegui sacar");
//		}
//		else {
//			System.out.println("Não consegui sacar");
//		}
	
	// saque 300 reais 
	
	minhaConta.saca(300);
	
	// depositar 500 reais 
	
	minhaConta.deposita(5000);
	
	System.out.println("Nome do titular " + minhaConta.dono);
	System.out.println("Limite disponivel " + minhaConta.limite);
	}

}
