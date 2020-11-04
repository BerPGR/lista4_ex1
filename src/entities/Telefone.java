package entities;


import java.util.Date;

public abstract class Telefone {
	
	private String nome;
	private String endereco;
	private Date dataInstalacao;
	private String numero;
	
	public Telefone() {
	}

	public Telefone(String nome, String endereco, Date dataInstalacao, String numero) {
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setDataInstalacao(dataInstalacao);
		this.setNumero(numero);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataInstalacao() {
		return dataInstalacao;
	}

	public void setDataInstalacao(Date dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public abstract double valorAPagar();
	
}
