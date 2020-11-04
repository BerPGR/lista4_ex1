package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Residencial extends Telefone{
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private boolean conexao;

	public Residencial(String nome, String endereco, Date dataInstalacao, String numero, boolean conexao) {
		super(nome, endereco, dataInstalacao, numero);
		this.setConexao(conexao);
	}

	public boolean isConexao() {
		return conexao;
	}

	public void setConexao(boolean conexao) {
		this.conexao = conexao;
	}

	@Override
	public double valorAPagar() {
		return 15.00;
	}
	
	public String toString() {
		return "TELEFONE RESIDENCIAL \n"
				+ "Nome usu�rio: "
				+ getNome() + "\n"
				+ "Endere�o: " + getEndereco() + "\n"
				+ "Numero: " + getNumero() + "\n"
				+ "Conex�o internet: " + isConexao() + "\n"
				+ "Data de instala��o: " + sdf.format(getDataInstalacao()) + "\n"
				+ "Valor a pagar: R$" + String.format("%.2f", valorAPagar());
	}
	

}
