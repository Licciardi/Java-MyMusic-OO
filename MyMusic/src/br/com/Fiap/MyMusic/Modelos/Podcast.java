package br.com.Fiap.MyMusic.Modelos;

public class Podcast extends Audio {
	
	private String host, descricacao;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getDescricacao() {
		return descricacao;
	}

	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}
	
	@Override
	public int getClassificacao() {
		if(getTotalDeCurtidas()>=100) {
			return 10;
		}
		else {
			return 6;
		}
		
		
	}
	
}
