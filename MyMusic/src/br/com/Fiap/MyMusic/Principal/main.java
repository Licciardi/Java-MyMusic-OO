package br.com.Fiap.MyMusic.Principal;


import br.com.Fiap.MyMusic.Modelos.Favoritos;
import br.com.Fiap.MyMusic.Modelos.Musica;
import br.com.Fiap.MyMusic.Modelos.Podcast;

public class main {

	public static void main(String[] args) {
		
		Musica musica = new Musica();
		musica.setTitulo("Rap do Naruto");
		musica.setArtista("Tauz");
		musica.setGenero("Rap");
		
	for (int i = 0; i < 1000; i++) {
		musica.reproduz();
		
	}
	for (int i = 0; i < 50; i++) {
		musica.curte();
	}
	 Podcast podcast = new Podcast();
	 podcast.setHost("Monark");
	 podcast.setDescricacao("pauta sobre o nazismo");
	 podcast.setTitulo("flow podcast");
	 
	 Favoritos fav = new Favoritos();
	 fav.inclui(musica);
	 fav.inclui(podcast);
	 
	}
}
