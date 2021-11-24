package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogo;

public class JogoRepository {

	private Jogo[] jogos;

	public JogoRepository() {
		jogos = new Jogo[32];
	}

	public JogoRepository(int quantidadeJogos) {
		jogos = new Jogo[quantidadeJogos];
	}

	public void gravar(Jogo jogo, int posicao) {
		this.jogos[posicao] = jogo;
	}

	public Jogo listarJogos(int posicao) {
		return jogos[posicao];
	}

	public Jogo[] listarTodos() {
		return jogos;
	}

}
