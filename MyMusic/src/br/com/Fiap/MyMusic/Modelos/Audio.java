package br.com.Fiap.MyMusic.Modelos;

public class Audio {
 private String titulo;
 private int totalDeReproducoes,totalDeCurtidas = 0;
 private int classificacao;
 
 
 
 public void curte(){
	 totalDeCurtidas++;
 }
 
 public void reproduz(){
	 totalDeReproducoes++;
 }
 
 
 
 
 
 
 
 
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getTotalDeReproducoes() {
	return totalDeReproducoes;
}
public void setTotalDeReproducoes(int totalDeReproducoes) {
	this.totalDeReproducoes = totalDeReproducoes;
}
public int getTotalDeCurtidas() {
	return totalDeCurtidas;
}
public void setTotalDeCurtidas(int totalDeCurtidas) {
	this.totalDeCurtidas = totalDeCurtidas;
}
public int getClassificacao() {
	return classificacao;
}
public void setClassificacao(int classificacao) {
	this.classificacao = classificacao;
}
 
 
}
