package entities;

import java.util.Date;

public class Residencial extends Telefone{
	
	private char conexao;

	public Residencial(String nome, String endereco, Date dataInstalacao, String numero, char conexao) {
		super(nome, endereco, dataInstalacao, numero);
		this.setConexao(conexao);
	}

	public char getConexao() {
		return conexao;
	}

	public void setConexao(char conexao) {
		this.conexao = conexao;
	}

	@Override
	public double valorAPagar() {
		return 15.00;
	}
	
	public String toString() {
		return null;
	}
	

}
