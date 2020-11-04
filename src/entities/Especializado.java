package entities;

import java.util.Date;

public class Especializado extends Telefone{
	
	private int qtdOcorrencias;

	public Especializado(String nome, String endereco, Date dataInstalacao, String numero, int qtdOcorrencias) {
		super(nome, endereco, dataInstalacao, numero);
		this.setQtdOcorrencias(qtdOcorrencias);
	}

	public int getQtdOcorrencias() {
		return qtdOcorrencias;
	}

	public void setQtdOcorrencias(int qtdOcorrencias) {
		this.qtdOcorrencias = qtdOcorrencias;
	}

	@Override
	public double valorAPagar() {
		return 0;
	}
	
	@Override
	public String toString() {
		return null;
	}

}
