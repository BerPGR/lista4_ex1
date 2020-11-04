package entities;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Comercial extends Telefone{
	
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataFixa;
	private String ramoAtividade;

	public Comercial(String nome, String endereco, Date dataInstalacao, String numero, Date dataFixa, String ramoAtividade) {
		super(nome, endereco, dataInstalacao, numero);
		this.setDataFixa(dataFixa);
		this.setRamoAtividade(ramoAtividade);
	}

	public String getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	public Date getDataFixa() {
		return dataFixa;
	}

	public void setDataFixa(Date dataFixa) {
		this.dataFixa = dataFixa;
	}

	@Override
	public double valorAPagar() {
		if(getDataInstalacao().before(dataFixa)) {
			return 25.00;
		}
		else {
			return 37.50;
		}
	}
	
	@Override
	public String toString() {
		return "TELEFONE COMERCIAL \n"
				+ "Nome usuário: "
				+ getNome() + "\n"
				+ "Endereço: " + getEndereco() + "\n"
				+ "Numero: " + getNumero() + "\n"
				+ "Ramo de atividade: " + getRamoAtividade() + "\n"
				+ "Data de instalação: " + sdf.format(getDataInstalacao()) + "\n"
				+ "Valor a pagar: R$" + String.format("%.2f", valorAPagar());
	}

}
