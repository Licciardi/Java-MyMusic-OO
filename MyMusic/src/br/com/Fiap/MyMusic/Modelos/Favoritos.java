package br.com.Fiap.MyMusic.Modelos;

public class Favoritos {

	public void inclui(Audio audio) {
		if(audio.getClassificacao() > 7){
			System.out.println("Favoritos: " + audio.getTitulo());
		} else {
			System.out.println("Veja tambem: " + audio.getTitulo());
		}
	}
	
	
}
