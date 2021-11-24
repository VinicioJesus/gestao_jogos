package br.senai.sp.jandira;
import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.JogoRepository;

public class App {

	public static void main(String[] args) {
		
		
		Jogo game = new Jogo ();
		game.setNome("Osu!");
		game.setConsole(Console.ANDROID);
		game.setdataLancamento("15/10/2007");		
		
		JogoRepository jogo1 = new JogoRepository(1);		
		jogo1.gravar(game, 0);
		System.out.println(jogo1.listarTodos());
		
	
		
		
		
	}

}
