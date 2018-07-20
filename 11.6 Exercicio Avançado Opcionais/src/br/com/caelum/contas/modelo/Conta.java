package br.com.caelum.contas.modelo;

public interface Conta {
	double getSaldo();

	void deposita(double valor);

	String saca(double valor);

	void atualiza(double taxaSelic);
	
	String recuperaDadosParaImpressao();

	Cliente getTitular();

	void setNumero(int int1);

	void setAgencia(int int1);

	String transferePara(Conta destino, double double1);
}