package br.senai.sp.jandira.model;

public class Jogo {

	private String nome;
	private String dataLancamento;
	private Console console;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public String getdataLancamento() {
		return dataLancamento;
	}

	public void setdataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Console getConsole() {
		return console;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

}
