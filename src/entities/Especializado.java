package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Especializado extends Telefone{
	
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
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
		if(getQtdOcorrencias() >= 1 && getQtdOcorrencias() <= 1000){
			return 50.00;
		}
		if(getQtdOcorrencias() >= 1001 && getQtdOcorrencias() <= 5000){
			return 67.80;
		}
		if(getQtdOcorrencias() >= 5001 && getQtdOcorrencias() <= 10000){
			return 98.50;
		}
		if(getQtdOcorrencias() >= 10001 && getQtdOcorrencias() <= 50000){
			return 123.90;
		}
		if(getQtdOcorrencias() > 50000){
			return 187.82;
		}
		else {
			throw new IllegalArgumentException("Número inválido");
		}
	}
	
	@Override
	public String toString() {
		return "TELEFONE ESPECIALIZADO \n"
				+ "Nome usuário: "
				+ getNome() + "\n"
				+ "Endereço: " + getEndereco() + "\n"
				+ "Numero: " + getNumero() + "\n"
				+ "Quantidade de ocorrências: " + getQtdOcorrencias() + "\n"
				+ "Data de instalação: " + sdf.format(getDataInstalacao()) + "\n"
				+ "Valor a pagar: R$" + String.format("%.2f", valorAPagar());
	}

}
