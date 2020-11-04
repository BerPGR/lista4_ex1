package entities;

import java.util.Date;

public class Comercial extends Telefone{
	
	private String ramoAtividade;

	public Comercial(String nome, String endereco, Date dataInstalacao, String numero, String ramoAtividade) {
		super(nome, endereco, dataInstalacao, numero);
		this.setRamoAtividade(ramoAtividade);
	}

	public String getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
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
